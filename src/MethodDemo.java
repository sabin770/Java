class Calc {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Calc calc = new Calc();

        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);
        int product = calc.multiply(10, 5);
        double quotient = calc.divide(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}