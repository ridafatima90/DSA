package map.questions;

import java.util.HashSet;

public class InterSection {

    public static int intersect(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int count = 0;

        for(int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }

        for(int j = 0; j < n2; j++) {
            if (set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(intersect(arr1, arr2));
    }
}
