// Question 8: Write a Java program demonstrating the difference between overloading and overriding.

class Parent {
    // Overloading method - different parameters
    void display() {
        System.out.println("Parent: No parameters");
    }

    void display(int a) {
        System.out.println("Parent: Integer - " + a);
    }

    // Overriding method
    void show() {
        System.out.println("Parent: Show method");
    }
}

class Child extends Parent {
    // Overriding - same method name, same parameters
    @Override
    void show() {
        System.out.println("Child: Show method (Overridden)");
    }

    // Overloading in child class
    void display(String str) {
        System.out.println("Child: String - " + str);
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        System.out.println("=== Overloading ===");
        p.display();
        p.display(10);
        c.display("Hello");

        System.out.println("\n=== Overriding ===");
        p.show();
        c.show();
    }
}