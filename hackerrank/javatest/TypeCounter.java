package hackerrank.javatest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TypeCounter {
    public static void main(String[] args) {
        String sentence = "1.2 @ give me 10 dollar 2.5 1.0";
        typeCounter(sentence);
    }
    public static void typeCounter(String sentence) {
        Scanner input = new Scanner(sentence);
        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;
        while(input.hasNext()){
            if(input.hasNext("[a-zA-Z0-9]+")){
                input.next();
                stringCount++;
            }else {
                try {
                    input.nextInt();
                    integerCount++;
                } catch(InputMismatchException e1) {
                    try {
                        input.nextDouble();
                        doubleCount++;
                    } catch (InputMismatchException e2) {
                        input.next();
                    }
                }
            }
        }
        System.out.println("String "+ stringCount);
        System.out.println("Integer "+ integerCount);
        System.out.println("Double "+ doubleCount);

    }

//    private static void stringCount(Scanner input) {
//        int stringLength = 0;
//        while(input.hasNext()){
//            if(input.hasNext("[a-zA-Z]+")){
//                input.next();
//                stringLength++;
//            }else {
//                input.next();
//            }
//        }
//        System.out.println("String "+ stringLength);
//    }
//    private static void integerCount(Scanner input) {
//        int integerLength = 0;
//        while(input.hasNext()){
//            if(input.hasNextInt()){
//                input.nextInt();
//                integerLength++;
//            }else {
//                input.next();
//            }
//        }
//        System.out.println("Integer "+ integerLength);
//
//    }
//
//    private static void doubleCount(Scanner input) {
//        int doubleLength = 0;
//        while(input.hasNext()){
//            if(input.hasNextDouble()){
//                input.nextDouble();
//                doubleLength++;
//            }else {
//                input.next();
//            }
//        }
//        System.out.println("Double "+ doubleLength);
//
//    }
}
