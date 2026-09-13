package model;

public class TestSame {
    public static void main(String[] args) {
        Student2 s = new Student2();

        System.out.println("=== Same Package Access ===");
        System.out.println("Public: " + s.rollNo);
        System.out.println("Protected: " + s.course);
        System.out.println("Default: " + s.college);
        // System.out.println("Private: " + s.name); // Error
    }
}