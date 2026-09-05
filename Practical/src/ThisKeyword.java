class Stud {
    int rollNo;
    String name;
    double marks;

    // Using this to distinguish instance variables from parameters
    Stud(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Using this to call another constructor
    Stud() {
        this(0, "Unknown", 0.0);
    }

    // Using this to call a method
    void display() {
        this.showDetails();
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Stud s1 = new Stud(101, "Savs", 85.5);
        s1.display();

        System.out.println();
        Stud s2 = new Stud();
        s2.display();
    }
}