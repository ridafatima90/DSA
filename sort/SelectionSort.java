package sort;

public class SelectionSort {
    public static void printArr(int arr[]){
        for(int i =0; i <arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,3,2,8,1};

        for(int i = 0; i < arr.length -1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
        }
        printArr(arr);
    }
}
