package map.questions;
import java.util.*;

public class IntersectionAnotherApproach {
    public static List<Integer> intersectAnother(int[] arr1, int[] arr2){
       List<Integer> intersection = new ArrayList<>();
       int n1 = arr1.length;
       int n2 = arr2.length;
       int i = 0, j =0;

       while(i < n1 && j < n2) {
           if(arr1[i] == arr2[j]) {
               intersection.add(arr1[i]);
               i++;
               j++;
           } else if (arr1[i] < arr2[j]) {
               i++;
           }else{
               j++;
           }
       }
       return intersection;

    }
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 9};
        int[] arr2 = {3, 4, 6, 9};
        System.out.println(intersectAnother(arr1, arr2));
    }
}
