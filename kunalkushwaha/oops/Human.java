package kunalkushwaha.oops;

public class Human {
    private int age;
    private String name;
    double salary;
    boolean married;
    static long population;

    public Human() {

    }

    static void message(){
        Human h = new Human();
        System.out.println(h.age);
    }

    public Human(int age, String name, double salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
    }
}
