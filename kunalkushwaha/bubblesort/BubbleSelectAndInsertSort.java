package kunalkushwaha.bubblesort;

import java.util.Arrays;

public class BubbleSelectAndInsertSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[]arr){
        for(int i = 0; i< arr.length -1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length -i-1;

            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int start, int end){
        for(int i = 0; i < arr.length; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i = start; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i< arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length -1; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
