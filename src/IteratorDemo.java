import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        Iterator<String> it = list.iterator();

        System.out.println("Elements:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}