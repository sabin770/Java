class Std1 extends Person {
    int rollNo;
    String course;
    double marks;

    Std1(String name, int age, String address, int rollNo, String course, double marks) {
        super(name, age, address);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
    }

    void displayStd1() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}