package kunalkushwaha.binarysearch;

import java.util.Arrays;
//Remember the array is not sorted here
//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(findInMountainArray(target, arr));
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakBinary(mountainArr);
        int start = 0;
        int end = mountainArr.length -1;
        int ans = orderAgnosticBinary(mountainArr, target, start, peak);
        if(ans != -1){
            return ans;
        }else {
            return orderAgnosticBinary(mountainArr, target, peak + 1, end);
        }

    }

    static int orderAgnosticBinary(int[] arr, int target, int start, int end){
        boolean isAscending = arr[end] - arr[start] > 0 ? true: false;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target < arr[mid]){
                    end = mid -1;
                }else if(target > arr[mid]){
                    start = mid +1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid-1;
                }else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }

    static int peakBinary(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid+1]){ //increasing part of array
                start = mid +1;
            }else { //decreasing part of array
                end = mid;
            }
        }
        return start;
    }
}
