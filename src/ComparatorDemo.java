import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student8 {
    int rollNo;
    String name;
    double marks;

    Student8(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student8> list = new ArrayList<>();

        list.add(new Student8(101, "Sabin", 85.5));
        list.add(new Student8(102, "Savin", 92.0));
        list.add(new Student8(103, "Pabin", 78.5));

        Collections.sort(list, new Comparator<Student8>() {
            public int compare(Student8 s1, Student8 s2) {
                return Double.compare(s1.marks, s2.marks);
            }
        });

        System.out.println("Sorted by Marks:");
        for (Student8 s : list) {
            System.out.println(s.rollNo + " - " + s.name + " - " + s.marks);
        }
    }
}