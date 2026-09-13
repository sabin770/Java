// Question 2 (continued): Main class using model and utility packages.

import model.Student;
import utility.Calculator;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Savs", "CS\n");
        Calculator calc = new Calculator();

        s.display();
        System.out.println("Sum: " + calc.add(10, 5));
        System.out.println("Product: " + calc.multiply(10, 5));
    }
}