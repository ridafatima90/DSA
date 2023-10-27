package map.questions;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int unionOf2Arrays(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }

        for(int i = 0; i < n2; i++) {
            set.add(arr2[i]);
        }

        for(int num: set) {
            System.out.print(num + " ");
        }

        return set.size();
    }


    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        System.out.println(unionOf2Arrays(arr1, arr2));
    }
}
