// Question 6: Write a Java program to demonstrate a final variable, final method, and final class.

// Final class - cannot be inherited
final class MathConstants {
    // Final variable - cannot be changed
    final double PI = 3.14159;

    // Final method - cannot be overridden
    final void display() {
        System.out.println("PI value: " + PI);
    }
}

// Cannot extend MathConstants (final class)
// class Test extends MathConstants { } // Error

// Regular class to test final
class Demo {
    void show() {
        MathConstants m = new MathConstants();
        System.out.println("Final variable: " + m.PI);
        // m.PI = 3.14; // Error: cannot change final variable

        m.display();
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}