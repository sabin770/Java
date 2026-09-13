// Question 2: Write a Java program to handle ArrayIndexOutOfBoundsException.

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }

        System.out.println("Program continues...");
    }
}