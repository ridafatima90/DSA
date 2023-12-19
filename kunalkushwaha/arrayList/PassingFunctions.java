package kunalkushwaha.arrayList;

import java.util.*;
import java.util.Scanner;

public class PassingFunctions {
    static  void change(int[] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];


        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j <arr[i].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

//        for(int[] ar: arr){
//            System.out.println(Arrays.toString(ar));
//        }
//        int[][] arr2 = {
//                {1,2,3,4},
//                {5,6},
//                {7,8,9}
//        };
//        for(int i = 0; i < arr2.length; i++){
//            for(int j = 0; j < arr2[i].length; j++){
//                System.out.print(arr2[i][j]+ " ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
