package leetcode.weeklycontest;

import java.util.*;

class MaxSubArrayLength {
    public static void main(String[] args) {
        int[] nums = {1,1,4};
        int k = 2;
        System.out.println(maxSubarrayLength(nums, k));
    }
    public static int maxSubarrayLength(int[] nums, int k) {
        if(nums.length <= k){
            return nums.length;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }


        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> x: map.entrySet()){

            set.add(x.getKey());

        }

        return set.size()*k;
    }
}