package recursion;

public class Example3 {
    public static int findWays(int n, int m){
        if(m == n) {
            return 2;
        }
        else if( n < m) {
            return 1;
        }
        //vertical placement
        int vert = findWays(n-m, m);

        //horizontal placement
        int hor = findWays(n-1, m);

        return vert+ hor;
    }
    public static void main(String[] args) {
        int n = 4, m= 2;
        System.out.println(findWays(n,m));
    }
}
