import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept two integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Perform calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Display results
        System.out.println("Sum        : " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Difference : " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Product    : " + num1 + " * " + num2 + " = " + product);
        System.out.println("Quotient   : " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Remainder  : " + num1 + " % " + num2 + " = " + remainder);
        System.out.println("=============================");

        input.close();
    }
}