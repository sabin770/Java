import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After add: " + list);

        // Get element
        System.out.println("Get(1): " + list.get(1));

        // Set element
        list.set(1, "Orange");
        System.out.println("After set: " + list);

        // Remove element
        list.remove("Mango");
        System.out.println("After remove: " + list);

        // Size
        System.out.println("Size: " + list.size());

        // Contains
        System.out.println("Contains Apple: " + list.contains("Apple"));

        // Loop
        System.out.println("Elements:");
        for (String s : list) {
            System.out.println(s);
        }

        // Clear
        list.clear();
        System.out.println("After clear: " + list);
    }
}