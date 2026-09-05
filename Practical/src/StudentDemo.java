class Student {
    // Fields
    String name;
    int rollNumber;
    String course;
    double marks;

    // Constructor
    Student(String name, int rollNumber, String course, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);

        // Grade calculation
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
        System.out.println("============================");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 101, "Computer", 85.5);
        Student s2 = new Student("Sabin Sap", 102, "BCA", 89.9);

        s1.displayInfo();
        s2.displayInfo();
    }
}