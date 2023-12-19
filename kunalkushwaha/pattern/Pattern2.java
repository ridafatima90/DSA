package kunalkushwaha.pattern;

public class Pattern2 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern2( int n){
        for(int row = 1; row <= n; row++){
            for(int col =row; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3( int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4( int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5( int n){
        for(int row = 0; row < 2*n; row++){
            int totalColumns = row > n ? 2*n -row: row;
            for(int col = 0; col < totalColumns; col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    static void pattern6( int n){
        for(int row = 0; row < 2*n; row++){
            int totalColumns = row > n?  2*n - row: row;
            int spaces = n- totalColumns;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalColumns; col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern7( int n){
        for(int row = 1; row <= n; row++){

            int spaces = n- row;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }
            for(int col =2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern8( int n){
        for(int row = 1; row <= 2*n; row++){
            int totalColumns = row > n?  2*n - row: row;
            for(int s = 0; s < n-totalColumns; s++){
                System.out.print("  ");
            }
            for(int col = totalColumns; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col =2; col <= totalColumns; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        int originalN = n;
        n = 2*n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
