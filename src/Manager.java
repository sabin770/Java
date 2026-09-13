class Manager extends Emp2 {
    String project;
    int teamSize;

    Manager(String name, int age, String address, int empId, String department,
            double salary, String project, int teamSize) {
        super(name, age, address, empId, department, salary);
        this.project = project;
        this.teamSize = teamSize;
    }

    void displayManager() {
        super.displayEmp2();
        System.out.println("Project: " + project);
        System.out.println("Team Size: " + teamSize);
    }
}