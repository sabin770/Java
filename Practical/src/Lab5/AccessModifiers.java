// Question 2: Write a Java program to demonstrate different access modifiers.

class AccessDemo {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println("=== Access Modifiers Demo ===");
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Default: " + obj.defaultVar);
        System.out.println("Protected: " + obj.protectedVar);

        System.out.println("\nUsing display() method:");
        obj.display();
    }
}