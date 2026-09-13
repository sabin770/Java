package utility;

import model.Student2;

public class AccessTest {
    public static void main(String[] args) {
        Student2 s = new Student2();

        System.out.println("=== Access from Different Package ===");
        System.out.println("Public: " + s.rollNo);

        // System.out.println("Private: " + s.name);     // Error
        // System.out.println("Protected: " + s.course); // Error
        // System.out.println("Default: " + s.college);  // Error

        System.out.println("\nAccessing through public method:");
        s.publicDisplay();
    }
}