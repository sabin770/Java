import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid option!");
        }

        input.close();
    }
}