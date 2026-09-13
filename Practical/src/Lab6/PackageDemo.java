// Question 3: Write a Java program demonstrating package access restrictions.

import mypackage.Student;

public class PackageDemo {
    public static void main(String[] args) {
        Student s = new Student(101, "Savsi", "BCA");
        s.display();
    }
}