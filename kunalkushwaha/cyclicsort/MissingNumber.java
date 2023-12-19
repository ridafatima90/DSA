package kunalkushwaha.cyclicsort;
//https://leetcode.com/problems/missing-number/

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
       int i = 0;
       while(i < nums.length){
           if(nums[i]< nums.length && nums[i] != nums[nums[i]]){
               swap(nums, i, nums[i]);
           }else {
               i++;
           }
       }

       for(int index = 0; index < nums.length; index++){
           if(nums[index] != index){
               return index;
           }
       }
       return nums.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}