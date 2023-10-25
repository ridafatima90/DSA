package matrix;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //Find out index
        int colStart = 0;
        int rowStart = 0;
        int colEnd = cols - 1;
        int rowEnd = rows -1;

        while(rowStart <= rowEnd && colStart <= colEnd) {

            //left to right
            for(int col = colStart; col<= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            //top to bottom
            for(int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colEnd--;

            //right to left
            for(int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //bottom to top
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}
