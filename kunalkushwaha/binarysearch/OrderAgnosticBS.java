package kunalkushwaha.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 2,3,99,4,5,6,7,8,11,33,42};
        int target =99;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAscending = arr[end] - arr[start] > 0 ? true: false;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid +1;
                }else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
