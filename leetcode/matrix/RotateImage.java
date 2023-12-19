package leetcode.matrix;
import java.util.*;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }

        for(int i = 0 ; i< matrix.length; i++){
            for(int j = i; j< matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotate(matrix);
    }
}
