package kunalkushwaha.binarysearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2,};
        System.out.println(binary(arr));
    }
    static int binary(int[] arr){
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
        return start; //return any start or end, both are equal
    }
}
