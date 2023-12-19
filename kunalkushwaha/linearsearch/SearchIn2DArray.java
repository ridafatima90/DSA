package kunalkushwaha.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {47,5},
                {1,2,3}
        };
        int target = 5;
        int[] ans = max2D(arr);
        System.out.println(Arrays.toString(ans));
    }

//    public static int[] search(int[][] arr, int target){
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j= 0; j<arr[i].length; j++){
//                if(arr[i][j] == target){
//                    return new int []{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

    public static int[] max2D(int[][] arr){
        int max = Integer.MIN_VALUE;
        int[] result = new int[]{-1,-1};
        for(int i = 0; i < arr.length; i++){
            for(int j= 0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    result[0]= i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
