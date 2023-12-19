package leetcode.matrix;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] subgrids = new int[9];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '0';

                    if((rows[i] & (1 << digit)) != 0){
                        return false;
                    }
                    rows[i] |= (1<<digit);

                    if((cols[j] & (1 << digit)) != 0){
                        return false;
                    }
                    cols[j] |= (1<<digit);

                    int subgridIndex = i/3*3 + j/3;

                    if((subgrids[subgridIndex] & (1 << digit)) != 0){
                        return false;
                    }
                    subgrids[subgridIndex] |= (1<<digit);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }
}
