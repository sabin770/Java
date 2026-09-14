import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        System.out.println("After add: " + set);

        // Try adding duplicate
        set.add("Apple");
        System.out.println("After adding duplicate Apple: " + set);

        // Size (duplicate not counted)
        System.out.println("Size: " + set.size());

        // Contains
        System.out.println("Contains Banana: " + set.contains("Banana"));

        // Remove
        set.remove("Mango");
        System.out.println("After remove: " + set);
    }
}