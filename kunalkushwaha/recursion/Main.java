package kunalkushwaha.recursion;

public class Main {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int n){
//        if(n == 5){
//            System.out.println("Allah is the God only- Mannawar and Ghunha says!");
//            return;
//        }
        System.out.println("Allah is the God only- Mannawar and Ghunha says!");
        message(n+1);
    }
}
