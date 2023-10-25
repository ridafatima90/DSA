package geeksforgeeks;

import java.util.Arrays;
import java.util.List;

public class SticklerThiefusingDP {

    static int findMaxSum(int[] arr, int n){
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;
        for(i = 1; i < n; i++) {
            excl_new = Math.max(excl, incl);
            incl = excl + arr[i];
            excl = excl_new;
        }

        return Math.max(excl, incl);
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 10, 100, 10, 0};
        int N = arr.length;
        System.out.println(findMaxSum(arr, N));
    }

}
