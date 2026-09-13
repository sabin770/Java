// Question 5: Create a StudentResult application using encapsulation and methods.

class StudentResult {
    private int rollNo;
    private String name;
    private double marks1;
    private double marks2;
    private double marks3;

    public StudentResult(int rollNo, String name, double marks1, double marks2, double marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    public double calculatePercentage() {
        return (calculateTotal() / 300) * 100;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 80) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 45) return "C";
        else return "F";
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }
}