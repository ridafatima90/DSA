package kunalkushwaha.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-14,-12,-8,0,2,3,4,5,6,22,48,59};
        int target = 22;
        int ans = binary(arr, target);
        System.out.println(ans);
    }
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
