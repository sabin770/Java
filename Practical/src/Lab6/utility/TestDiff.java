package utility;

import model.Student2;

public class TestDiff {
    public static void main(String[] args) {
        Student2 s = new Student2();

        System.out.println("=== Different Package Access ===");
        System.out.println("Public: " + s.rollNo);
        // System.out.println("Protected: " + s.course); // Error
        // System.out.println("Default: " + s.college);  // Error
        // System.out.println("Private: " + s.name);     // Error

        System.out.println("\nUsing publicDisplay method:");
        s.publicDisplay();
    }
}