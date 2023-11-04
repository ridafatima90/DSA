package stack;

import java.util.Arrays;
import java.util.Stack;

public class MinMaxRiddle {
    static long[] riddle(long[] arr) {
        // complete this function
        int n = arr.length;
        long[] result = new long[n];
        Stack<Integer> stack = new Stack<>();

        int[]left = new int[n];
        int[]right = new int[n];

        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                left[i]= stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        for(int i = n - 1; i >= 1; i--){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                right[i]= stack.peek();
            }else{
                right[i] = n;
            }

            stack.push(i);
        }

        for(int i = 0; i < n; i++){
            int windowSize = right[i] - left[i] - 1;

            result[windowSize -1 ] = Math.max(result[windowSize -1], arr[i]);

        }

        for(int i = n-2; i >=0; i--){
            result[i] = Math.max(result[i], result[i+1]);
        }

        return result;

    }

    public static void main(String[] args) {

        long[] myArray = {2L, 6L, 1L, 12L};
        System.out.print(Arrays.toString(riddle(myArray)));
    }
}
