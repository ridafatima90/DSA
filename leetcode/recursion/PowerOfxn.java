package leetcode.recursion;
//https://leetcode.com/problems/powx-n/
public class PowerOfxn {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2147483648;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
        if(n== 0){
            return 1;
        }
        if(n < 0 && Integer.MIN_VALUE < n ){
            x = 1/x;
            n = -n;
        }

        return (n%2 == 0)? myPow(x*x, n/2): x*myPow(x*x, n/2);

    }
}