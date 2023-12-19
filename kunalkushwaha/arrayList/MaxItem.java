package kunalkushwaha.arrayList;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        maxRange(arr, 0, 3);
    }

    static void maxRange(int[] arr, int start,  int end){
        int max = start;
        for(int i = 0; i < end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
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
