// Question 3: Create a hierarchical inheritance example.

public class HierarchicalDemo {
    public static void main(String[] args) {
        Crcl1 c = new Crcl1("Red", 5);
        Rct1 r = new Rct1("Blue", 4, 6);

        System.out.println("=== Circle ===");
        c.displayCrcl1();

        System.out.println("\n=== Rectangle ===");
        r.displayRct1();
    }
}