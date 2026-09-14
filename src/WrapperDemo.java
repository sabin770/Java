public class WrapperDemo {
    public static void main(String[] args) {
        // Autoboxing: primitive → wrapper object
        int num = 10;
        Integer obj = num;
        System.out.println("Autoboxing: " + obj);

        // Unboxing: wrapper object → primitive
        Integer obj2 = 20;
        int num2 = obj2;
        System.out.println("Unboxing: " + num2);

        // Wrapper class methods
        System.out.println("\n=== Wrapper Methods ===");
        System.out.println("Integer.parseInt(\"100\"): " + Integer.parseInt("100"));
        System.out.println("Integer.valueOf(50): " + Integer.valueOf(50));
        System.out.println("Double.parseDouble(\"3.14\"): " + Double.parseDouble("3.14"));
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
    }
}