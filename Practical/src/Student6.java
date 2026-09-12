import java.io.Serializable;

class Student6 implements Serializable {
    int rollNo;
    String name;
    String course;

    Student6(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
}