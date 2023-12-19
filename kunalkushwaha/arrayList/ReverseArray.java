package kunalkushwaha.arrayList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr);
    }

    static void swap(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = 0;
        for(int i = 0; i < 3; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
       return max;
    }
}
