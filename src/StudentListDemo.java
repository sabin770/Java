import java.util.ArrayList;

class Student9 {
    int rollNo;
    String name;

    Student9(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " - " + name);
    }
}

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student9> list = new ArrayList<>();

        list.add(new Student9(101, "Sabin"));
        list.add(new Student9(102, "Savin"));
        list.add(new Student9(103, "Savs"));

        System.out.println("=== Student9 List ===");
        for (Student9 s : list) {
            s.display();
        }

        System.out.println("\nTotal Student9s: " + list.size());
    }
}