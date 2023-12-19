package kunalkushwaha.binarysearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        if(pivot == -1){
            return binary(nums, target, 0, nums.length -1);
        }

        if(nums[pivot] == target) return pivot;

        if(target >= nums[0]) return binary(nums, target, 0, pivot-1);
        return binary(nums, target, pivot+1, nums.length -1);
    }

    static int binary(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid -1;
            }
            //if there are duplicates just skip them
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end -1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid +1;
            }else {
                end = mid+1;
            }

        }
        return -1;
    }
}
