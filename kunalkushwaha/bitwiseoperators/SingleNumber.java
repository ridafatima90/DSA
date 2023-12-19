package kunalkushwaha.bitwiseoperators;

import java.util.*;

//https://leetcode.com/problems/single-number/?envType=study-plan-v2&envId=top-interview-150
class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == 1){
                ans = nums[i];
                System.out.println(ans);
                break;
            }
        }
        return ans;
    }
}