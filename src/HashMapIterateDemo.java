import java.util.HashMap;
import java.util.Map;

public class HashMapIterateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Savin");
        map.put(102, "Sabin");
        map.put(103, "Savs");

        System.out.println("Using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}