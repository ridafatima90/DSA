package recursion;

public class FibonacciIteratively {
    public static void printFibIter(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);

        while(b < n ) {
            System.out.println(b);
            int temp = a +b;
            a = b;
            b = temp;
        }
    }
    public static void main(String[] args) {
        printFibIter(5);
    }
}
