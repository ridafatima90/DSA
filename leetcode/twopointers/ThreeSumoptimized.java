package leetcode.twopointers;

import java.util.*;
//https://leetcode.com/problems/3sum/?envType=study-plan-v2&envId=top-interview-150
public class ThreeSumoptimized {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3){
            return result;
        }
        Arrays.sort(nums);

        for(int i = 0; i< nums.length -2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int target = -nums[i];
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = i+1; j < nums.length; j++){
                int complement = target - nums[j];
                if(map.containsKey(complement)){
                    result.add(Arrays.asList(nums[i], nums[j], complement));
                    while(j < nums.length -1 && nums[j] == nums[j+1]){
                        j++;
                    }
                }else {
                    map.put(nums[j], j);
                }
            }

        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
