package mypackage;

public class Studentt {
    // Instance variables
    private String name;
    private int age;

    // Static variable
    private static int totalStudents = 0;

    // Constructor
    public Studentt(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++;
    }

    // Static method
    public static int getTotalStudentts() {
        return totalStudents;
    }

    // Instance method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}