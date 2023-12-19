package leetcode;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit2(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        boolean allDescending = true;

        for(int i = 0; i < prices.length -1 ; i++){
            if(prices[i] <prices[i+1]){
                allDescending = false;
                break;
            }
        }
        if(allDescending){
            return 0;
        }

        for(int i = 0; i < prices.length -1; i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
            }else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit2(prices));
    }
}
