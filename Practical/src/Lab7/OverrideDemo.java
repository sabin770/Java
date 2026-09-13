// Question 7: Create an inheritance hierarchy and override toString(), equals(), and hashCode().

class Student5 extends Prsn {
    int rollNo;
    String course;

    Student5(int id, String name, int rollNo, String course) {
        super(id, name);
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", RollNo=" + rollNo + ", Course=" + course + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Student5 s = (Student5) obj;
        return rollNo == s.rollNo && course.equals(s.course);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + rollNo + course.hashCode();
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        Student5 s1 = new Student5(1, "Savs", 101, "CS");
        Student5 s2 = new Student5(1, "Savs", 101, "CS");
        Student5 s3 = new Student5(2, "Savs", 102, "IT");

        System.out.println("Using toString():");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("\nUsing equals():");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        System.out.println("\nUsing hashCode():");
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
    }
}