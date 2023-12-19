package kunalkushwaha.math;

public class SquareRoot {
    public static void main(String[] args) {
        double n = 5;
        System.out.println(sqrt(n));
    }

    public static double sqrt(double n){
        return Math.pow(n, .5);
    }
}
