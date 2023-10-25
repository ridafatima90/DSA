package dsacore.lists;

import java.sql.SQLOutput;
import java.util.Arrays;

class Pair{
    int min;
    int max;
}

public class MaxAndMinElement {

    public static Pair getMinMax(int[] arr, int n){
        Pair minMax = new Pair();
        Arrays.sort(arr);
        minMax.min = arr[0];
        minMax.max = arr[n-1];
        return minMax;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;
        Pair minMax = getMinMax(arr, arr_size);
        System.out.println(minMax.min);
        System.out.println(minMax.max);

    }
}
