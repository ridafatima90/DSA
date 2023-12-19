package kunalkushwaha.binarysearch;

import java.util.Arrays;

public class Search2DMatrix {

    public static void main(String[] args) {
//        int[][] matrix = {{1,3,5,7},
//                            {10,11,16,20},
//                            {23,30,34,50}};
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 5, 6},
                {7, 8, 9}};
//        int[][] matrix = {{1},
//                            {3}};
//        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target = 9;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    public static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        System.out.println("rows "+rows);
        int cols = matrix[0].length;

        System.out.println("cols "+cols);

        boolean present = false;
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        //now run the loop till two rows are remaining
        while(rStart < (rEnd -1)){
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }

        //now we have two rows
        //check whether the target is in the cols of two rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        //now check in the other row
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart +1, cMid};
        }

        //search in first half
        if(cMid > 0 && target <= matrix[rStart][cMid -1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //search in second half
        if (target >= matrix[rStart][cMid] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid, cols - 1, target);
        }

        //search in third half
        if(cMid > 0 && target <= matrix[rStart+1][cMid -1]){
            return binarySearch(matrix, rStart+1, 0, cMid -1, target);
        }
        //search in fourth half
        else{
            return binarySearch(matrix, rStart+1, cMid+1, cols -1, target);
        }
    }

    static int[] binarySearch(int[][]matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid+1;
            }else {
                cEnd = mid -1;
            }
        }
        return new int[]{-1, -1};
    }
}
