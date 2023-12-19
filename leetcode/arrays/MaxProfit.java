package leetcode.arrays;

import java.util.*;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        List<Integer> list = new ArrayList<>();
        int maxP = 0;
        for(int i = 0; i< prices.length -1; i++) {
            if (prices[i + 1] > prices[i]) {
                list.add(prices[i + 1] - prices[i]);
            }
        }
        for(int num: list){
            maxP += num;
        }
        return maxP;
    }
}