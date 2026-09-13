// Question 5: Write a Java program demonstrating finally.

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues...");
    }
}