package kunalkushwaha.oops.abstractdemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love SuperMan");
    }

    @Override
    void normalMethod() {
        super.normalMethod();
        System.out.println("This normal method is from daughter class");
    }
}
