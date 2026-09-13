import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("\nSimple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + totalAmount);

        input.close();
    }
}