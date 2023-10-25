package dsacore.lists;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {


        int minPrice = prices[0];
        int maxProfit = 0;
        boolean allDescending = true;
        for(int i =0; i < prices.length -1; i++){
            if(prices[i] < prices[i+1]){
                allDescending = false;
                break;
            }
        }
        if(allDescending){
            return 0;
        }

        for(int i = 1; i< prices.length; i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
            }else {
                int currentProfit = prices[i]- minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }


        return maxProfit;
    }

}