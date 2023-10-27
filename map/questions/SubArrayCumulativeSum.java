package map.questions;

import java.util.HashMap;

public class SubArrayCumulativeSum {
    private static int countSubArrayWithSum(int[] arr, int k) {
        HashMap<Integer, Integer> subArray = new HashMap<>();
        int ans = 0;
        int sum = 0;

        subArray.put(0, 1);

        for(int num: arr) {
            sum += num;

            if(subArray.containsKey(sum - k)) {
                ans += subArray.get(sum - k);
            }

            subArray.put(sum, subArray.getOrDefault(sum, 0) +1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;

        int result = countSubArrayWithSum(arr, k);
        System.out.println(result);
    }

}
