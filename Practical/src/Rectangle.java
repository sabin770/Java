import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("\nArea = " + area);
        System.out.println("Perimeter = " + perimeter);

        input.close();
    }
}