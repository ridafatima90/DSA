package map.questions;

import java.util.Arrays;

public class UnionOfTwoArraysSorting {

    public static void printUnionOf2Arrays(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        //1.concatenation
        int[] mergedArray = new int[n1 + n2];
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1, n2);

        //2.Sort
        Arrays.sort(mergedArray);

        //3.Print
        for(int i = 0; i < n1 + n2; i++) {
            if (i == 0 || mergedArray[i] != mergedArray[i - 1]) {
                System.out.print(mergedArray[i] + " ");
            }
        }


    }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        printUnionOf2Arrays(arr1, arr2);
    }
}
