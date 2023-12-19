package kunalkushwaha.bitwiseoperators;

import java.util.*;

//https://leetcode.com/problems/single-number-ii/?envType=study-plan-v2&envId=top-interview-150
public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++){
//            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//        }
//        int num = 0;
//        for(int i = 0; i< nums.length; i++){
//            if(map.get(nums[i]) ==1){
//                num = nums[i];
//            }
//        }
//        return num;

        int ones = 0, twos = 0;
        for(int num: nums){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
