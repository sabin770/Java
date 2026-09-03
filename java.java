// //Write a program to swap two numbers using bitwise XOR operator.
// import java.util.Scanner;
// public class java {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int firstNumber = scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int secondNumber = scanner.nextInt();

//         // Swapping using XOR
//         firstNumber = firstNumber ^ secondNumber; // Step 1: firstNumber now holds the result of XOR
//         secondNumber = firstNumber ^ secondNumber; // Step 2: secondNumber now holds the original value of firstNumber
//         firstNumber = firstNumber ^ secondNumber; // Step 3: firstNumber now holds the original value of secondNumber

//         System.out.println("After swapping:");
//         System.out.println("First number: " + firstNumber);
//         System.out.println("Second number: " + secondNumber);

//         scanner.close();
//     }
// }

public class java {
    String string = "Hello, World!";
    int number = 42;

    public static void main(String[] args) {
        System.out.println("This is main method ");
    }

    public void display() {
        System.out.println("This is given String: " + string);
        System.out.println("This is given Number: " + number);
    }
}