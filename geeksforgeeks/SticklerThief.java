package geeksforgeeks;

public class SticklerThief {
    static int rec(int nums[], int idx, int N){
        if(idx >= N) {
            return 0;
        }
        return Math.max(nums[idx] + rec(nums, idx +2, N), rec(nums, idx+1, N));
    }

    static int findMaxSum(int[] arr, int N){
        return rec(arr, 0, N);
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 100, 10,5};
        int N= 6;
        System.out.println(findMaxSum(arr, N));
    }
}
