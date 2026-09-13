// Question 6: Write a Java program demonstrating throw and throws.

class Calcu {
    void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
}

public class ThrowThrowsDemo {
    public static void main(String[] args) {
        Calcu calc = new Calcu();

        try {
            calc.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            calc.divide(10, 2);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}