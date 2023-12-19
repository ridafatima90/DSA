package kunalkushwaha.oops.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(3);
        s.career();

        Parent d = new Daughter(1);
        d.career();
        d.normalMethod();
    }
}
