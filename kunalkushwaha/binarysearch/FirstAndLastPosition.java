package kunalkushwaha.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] pos = {-1, -1};
        int endIndex = -1;
        int startIndex = search(nums, target, true);
        if(startIndex != -1) {
            endIndex = search(nums, target, false);
        }
        pos[0]= startIndex;
        pos[1] = endIndex;
        return pos;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}

