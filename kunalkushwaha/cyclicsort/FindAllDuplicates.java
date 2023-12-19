package kunalkushwaha.cyclicsort;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;

class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        for(int j = 0; j< nums.length; j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;

    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}