package sort;

public class InsertionSort {

    public static void printArr(int arr[]){
        for(int i =0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,3,8,2,1};

        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;  //this is sorted part last index
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArr(arr);
    }
}
