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