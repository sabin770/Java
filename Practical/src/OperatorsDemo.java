public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 20, b = 10;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("\n=== Assignment Operators ===");
        int c = 10;
        System.out.println("c = " + c);c += 5;
        System.out.println("c += 5: " + c);c -= 3;
        System.out.println("c -= 3: " + c);c *= 2;
        System.out.println("c *= 2: " + c);c /= 4;
        System.out.println("c /= 4: " + c);c %= 3;
        System.out.println("c %= 3: " + c);

        System.out.println("\n=== Conditional (Ternary) Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
    }
}