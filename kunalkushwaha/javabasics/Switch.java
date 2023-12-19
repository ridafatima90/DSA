package kunalkushwaha.javabasics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Id = sc.nextInt();
        String s = sc.next();

        switch (Id) {
            case 1 -> System.out.println("Mannawar");
            case 2 -> {
                System.out.println("Zarien");
                switch (s) {
                    case "IT" -> System.out.println("IT dept");
                    case "Management" -> System.out.println("Management dept");
                    default -> System.out.println("No dept entered");
                }
            }
            default -> System.out.println("Enter correct id");
        }

    }
}
