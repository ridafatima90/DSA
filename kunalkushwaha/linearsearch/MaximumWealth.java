package kunalkushwaha.linearsearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum > max){
                max= sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
