package leetcode.matrix;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        if(matrix.length == 0){
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int i = 0; i< rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        firstRowZero = true;
                    }else{
                        matrix[0][j] = 0;
                    }
                    if(j == 0){
                        firstColZero = true;
                    }else{
                        matrix[i][0]= 0;
                    }
                }
            }
        }

        for(int i = 1; i < rows; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j< cols; j++){
                    matrix[i][j]= 0;
                }
            }
        }

        for(int j = 1; j < cols; j++){
            if(matrix[0][1] == 0){
                for(int i = 0; i< rows; i++){
                    matrix[i][j]= 0;
                }
            }
        }

        if(firstRowZero){
            for(int j = 0; j < cols; j++){
                matrix[0][j]= 0;
            }
        }
        if(firstColZero){
            for(int i = 0; i < rows; i++){
                matrix[i][0] = 0;
            }
        }


    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},
                            {3,4,5,2},
                            {1,3,1,5}};

        setZeroes(matrix);
    }
}
