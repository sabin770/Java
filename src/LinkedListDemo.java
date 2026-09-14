import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After add: " + list);

        // Add at first and last
        list.addFirst("Orange");
        list.addLast("Grapes");
        System.out.println("After addFirst/addLast: " + list);

        // Get first and last
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // Remove first and last
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst/removeLast: " + list);

        // Size
        System.out.println("Size: " + list.size());
    }
}