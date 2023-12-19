package leetcode.hashmap;
import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
//        Arrays.sort(nums);
        while (left < right){
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[]{left, right};
            }else if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] results = twoSum(nums, target);
        System.out.println(Arrays.toString(results));
    }
}
