package hackerrank.javatest;

import java.util.Scanner;

public class JavaShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        int length = input.nextInt();
        int breadth = input.nextInt();
        Rectangle rect = new Rectangle(length, breadth);
        rect.area();
    }
    static class Shape{
        int length;
        int breadth;

        public Shape(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        void area(){
            System.out.println(this.length + " " + this.breadth);
        }
    }

    static class Rectangle extends Shape{

        public Rectangle(int length, int breadth) {
            super(length, breadth);
        }

        @Override
        void area() {
            super.area();
            System.out.println(length * breadth);
        }
    }
}
