public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "  Java Programming  ";

        System.out.println("=== String Methods Demo ===");
        System.out.println("Original String: " + str);

        // Length
        System.out.println("\n1. length(): " + str.length());

        // Character at index
        System.out.println("2. charAt(0): " + str.charAt(0));
        System.out.println("   charAt(6): " + str.charAt(6));

        // Substring
        System.out.println("3. substring(6): " + str.substring(6));
        System.out.println("   substring(0,5): " + str.substring(0,5));

        // Case conversion
        System.out.println("4. toUpperCase(): " + str.toUpperCase());
        System.out.println("5. toLowerCase(): " + str.toLowerCase());

        // Trim
        System.out.println("6. trim(): '" + str2.trim() + "'");

        // Replace
        System.out.println("7. replace('l', 'x'): " + str.replace('l', 'x'));
        System.out.println("8. replace(\"World\", \"Java\"): " + str.replace("World", "Java"));

        // Contains
        System.out.println("9. contains(\"World\"): " + str.contains("World"));
        System.out.println("   contains(\"Python\"): " + str.contains("Python"));

        // StartsWith / EndsWith
        System.out.println("10. startsWith(\"Hello\"): " + str.startsWith("Hello"));
        System.out.println("    endsWith(\"World\"): " + str.endsWith("World"));

        // Index of
        System.out.println("11. indexOf('o'): " + str.indexOf('o'));
        System.out.println("    lastIndexOf('o'): " + str.lastIndexOf('o'));

        // Equals
        System.out.println("12. equals(\"Hello World\"): " + str.equals("Hello World"));
        System.out.println("    equalsIgnoreCase(\"hello world\"): " + str.equalsIgnoreCase("hello world"));

        // Split
        String[] words = str.split(" ");
        System.out.println("13. split(\" \"):");
        for (String word : words) {
            System.out.println("    " + word);
        }

        // Concat
        System.out.println("14. concat(\" !!!\"): " + str.concat(" !!!"));

        // isEmpty
        System.out.println("15. isEmpty(): " + str.isEmpty());
        System.out.println("    \"\".isEmpty(): " + "".isEmpty());

        // toCharArray
        char[] chars = str.toCharArray();
        System.out.println("16. toCharArray(): " + chars.length + " characters");

        // String builder
        System.out.println("\n=== String Comparison ===");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLO";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
    }
}