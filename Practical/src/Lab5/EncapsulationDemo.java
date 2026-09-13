// Question 1: Create an encapsulated Student class using private fields and getter/setter methods.

class Student1 {
    private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    public double getMarks() {
        return marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student1 s = new Student1();

        s.setRollNo(101);
        s.setName("Savs");
        s.setMarks(85.5);

        System.out.println("Using getters:");
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());

        System.out.println("\nUsing display method:");
        s.display();
    }
}