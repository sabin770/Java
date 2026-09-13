// Question 2: Create a multilevel inheritance hierarchy using Person, Employee, and Manager.

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Savin", 35, "Kathmandu", 101, "IT", 75000, "AI Project", 10);

        System.out.println("=== Manager Details ===");
        m.displayManager();
    }
}