class Emp2 extends Person {
    int empId;
    String department;
    double salary;

    Emp2(String name, int age, String address, int empId, String department, double salary) {
        super(name, age, address);
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }

    void displayEmp2() {
        super.display();
        System.out.println("Emp2 ID: " + empId);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}