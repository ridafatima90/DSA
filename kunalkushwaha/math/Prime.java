package kunalkushwaha.math;

public class Prime {
    public static void main(String[] args) {
        int n = 4;
        prime(n);
    }

    private static void prime(int n) {
        for(int i = 2; i < n; i++){
            if(n %i == 0){
                System.out.println("not prime");
                break;
            }else{
                System.out.println("Prime number");
                break;
            }
        }
    }
}
