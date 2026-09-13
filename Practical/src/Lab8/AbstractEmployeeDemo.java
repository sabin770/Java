// Question 5: Create an abstract Employee class and implement suitable subclasses.

public class AbstractEmployeeDemo {
    public static void main(String[] args) {
        Dev3 d = new Dev3(101, "Savin", 50000);
        Mag3 m = new Mag3(102, "Sabin", 75000);

        System.out.println("=== Developer ===");
        d.display();

        System.out.println("\n=== Manager ===");
        m.display();
    }
}