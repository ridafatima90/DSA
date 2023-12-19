package kunalkushwaha.arrayList;

import java.util.*;

public class ArrayLst {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int num: arr){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));
    }
}
