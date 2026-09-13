public class AbstractDemo1 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        Bike1 b = new Bike1();

        System.out.println("=== Car ===");
        c.start();
        c.stop();

        System.out.println("\n=== Bike ===");
        b.start();
        b.stop();
    }
}