package kunalkushwaha.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student mannawar = new Student(12, 89.56f);
        Student ghuncha = new Student(1, 99.56f);
        Student ourson = new Student(2, 98.56f);
        Student ourdaughter = new Student(3, 95.56f);
        Student[] list = {mannawar, ghuncha, ourson, ourdaughter};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));


        if(ghuncha.compareTo(mannawar) < 0) {
            System.out.println("Ghuncha is best");
        }
    }
}
