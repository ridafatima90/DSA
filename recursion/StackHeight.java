package recursion;

import static java.lang.Math.pow;

public class StackHeight {
    public static int printStackHeight(int x, int n){
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int rec = printStackHeight(x , n-1);

        return (x * rec);
    }

    public static void main(String[] args) {
        System.out.println(printStackHeight(2,5));
    }
}
