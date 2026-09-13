class Dev3 extends Emp3 {
    Dev3(int empId, String name, double salary) {
        super(empId, name, salary);
    }

    double calculateBonus() {
        return salary * 0.15;
    }
}