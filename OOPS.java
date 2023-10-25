class Student {
    String name;
    static String schoolName;
}

public class OOPS {
    public static void main(String[] args) {
        Student.schoolName = "KV";
        Student s1 = new Student();
        s1.name = "Mannawar";
        System.out.println(Student.schoolName);
    }
}
