class Mag3 extends Emp3 {
    Mag3(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    double calculateBonus() {
        return salary * 0.25;
    }
}