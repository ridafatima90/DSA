package kunalkushwaha.oops.abstractdemo;

public abstract class Parent {
    static int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 356546;
    }

    static void greeting(){
        System.out.println("Hi");
    }
    void normalMethod(){
        System.out.println("Allah is the greatest of all");
    }

    abstract void career();
    abstract void partner();
}
