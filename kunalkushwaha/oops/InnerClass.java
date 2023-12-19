package kunalkushwaha.oops;

import java.util.Arrays;

public class InnerClass {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {

        Test testA = new Test("Ram");
        Test testB = new Test("Pam");

        System.out.println(testA);
    }
}
