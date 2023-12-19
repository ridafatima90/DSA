package leetcode;
import java.util.*;
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j< nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static int removeDuplicates2(int[] nums) {
        int index = 2;
        if(nums.length <= 2) {
            return nums.length;
        }
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[index-2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int val = 3;
        System.out.println(removeDuplicates2(nums));
    }
}
