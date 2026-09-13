abstract class Emp3 {
    int empId;
    String name;
    double salary;

    Emp3(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();

    void display() {
        System.out.println("Emp3 ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}