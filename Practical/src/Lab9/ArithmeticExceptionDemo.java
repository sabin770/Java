// Question 1: Write a Java program to handle ArithmeticException.

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}