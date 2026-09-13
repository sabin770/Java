// Question 5 (continued): StudentResult application main class.

public class StudentResultApp {
    public static void main(String[] args) {
        StudentResult s1 = new StudentResult(101, "Savs", 85, 90, 78);
        StudentResult s2 = new StudentResult(102, "Kabs", 45, 50, 55);
        StudentResult s3 = new StudentResult(103, "Labs", 30, 25, 35);

        System.out.println("=== Student Results ===\n");
        s1.display();
        s2.display();
        s3.display();
    }
}