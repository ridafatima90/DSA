package kunalkushwaha.oops;

public class StaticBlock {
    static int a = 4;
    static int b = 5;

    static {
        System.out.println("I am in static block");
        b = a *5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(a +" "+ b);

        b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(a +" "+ b);
    }
}
