package recursion;

public class StackHeightLog {
    public static int printStackHt(int x, int n){
        if(n ==0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        //work
        if (n % 2 == 0) {

            return printStackHt(x, n/2) * printStackHt(x, n/2);
        }else {
            return printStackHt(x, n/2) * printStackHt(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        System.out.println(printStackHt(2,3));
    }
}
