package kunalkushwaha.binarysearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int ans = findPivotWithoutDuplicates(arr) +1;
        System.out.println(ans);
    }

    static int findPivotWithoutDuplicates(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while(start<= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }if(mid > start && nums[mid] < nums[mid -1]){
                return mid-1;
            }if(nums[mid]<=nums[start]){
                end = mid-1;
            }else{
                start = mid+1;
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
