package recursion;

public class Example4 {
    public static int waysToCallPerson(int n){
        if(n <= 1) {
            return 1;
        }

        //single
        int single = waysToCallPerson(n-1);

        //pairs
        int pairs = (n-1)*waysToCallPerson(n-2);

        return single+pairs;

    }

    public static void main(String[] args) {
        System.out.println(waysToCallPerson(5));

    }
}
