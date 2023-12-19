package kunalkushwaha.math;

public class OptimizedPrime {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 2; i<= n; i++){
            System.out.println(i+ " " + prime(i));
        }
    }

    private static boolean prime(int n) {
        if(n<=1 ){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
