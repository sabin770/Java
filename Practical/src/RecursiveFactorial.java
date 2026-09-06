import java.util.Scanner;

public class RecursiveFactorial {
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        RecursiveFactorial obj = new RecursiveFactorial();
        int result = obj.factorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}