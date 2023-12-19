package kunalkushwaha.oops.access2;

import kunalkushwaha.oops.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A a = new A(3, "ourson");
//        int b = a.num;
    }
}

class SubSubClass extends SubClass {
    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 a = new SubClass2(3, "ourson");
//        int b = a.num;
    }
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 a = new SubClass2(3, "ourson");
//        int b = a.num;
    }
}