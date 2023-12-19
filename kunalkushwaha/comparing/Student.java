package kunalkushwaha.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    public int roll;
    public float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
