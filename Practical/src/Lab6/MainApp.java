// Question 6: Create a simple application integrating packages, classes, objects, constructors, and static members.

import mypackage.Studentt;

public class MainApp {
    public static void main(String[] args) {
        // Creating objects using constructor
        Studentt s1 = new Studentt("Savs", 20);
        Studentt s2 = new Studentt("Bavs", 22);
        Studentt s3 = new Studentt("Cavs", 21);

        // Display each student
        s1.display();
        s2.display();
        s3.display();

        // Using static method
        System.out.println("Total Students: " + Studentt.getTotalStudentts());
    }
}