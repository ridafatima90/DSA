package kunalkushwaha.oops.access;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A a = new A(3, "ourson");
        int b = a.num;
    }
}
