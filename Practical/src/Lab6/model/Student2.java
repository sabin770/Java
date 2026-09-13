package model;

public class Student2 {
    public int rollNo = 101;
    private String name = "Savs";
    protected String course = "CS";
    String college = "Mega College";

    public void publicDisplay() {
        System.out.println("Public: " + rollNo);
        System.out.println("Private: " + name);
        System.out.println("Protected: " + course);
        System.out.println("Default: " + college);
    }
}