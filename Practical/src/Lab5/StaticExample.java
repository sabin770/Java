// Question 5: Write a Java program to demonstrate static variables, methods, and blocks.

class StaticDemo {
    static int count = 0;
    int instanceVar = 0;

    static {
        System.out.println("Static block executed");
        count = 100;
    }

    StaticDemo() {
        count++;
        instanceVar++;
        System.out.println("Instance created. Count: " + count);
    }

    static void displayCount() {
        System.out.println("Total objects: " + count);
    }

    void displayInstance() {
        System.out.println("Instance variable: " + instanceVar);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        System.out.println("Main method started");

        System.out.println("Static variable: " + StaticDemo.count);
        StaticDemo.displayCount();

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        StaticDemo.displayCount();
        obj1.displayInstance();
    }
}