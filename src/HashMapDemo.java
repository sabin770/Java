import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Put key-value pairs
        map.put(101, "Sabin");
        map.put(102, "Savin");
        map.put(103, "Savs");
        System.out.println("After put: " + map);

        // Get value by key
        System.out.println("Get(102): " + map.get(102));

        // Check key
        System.out.println("Contains key 101: " + map.containsKey(101));

        // Check value
        System.out.println("Contains value Jane: " + map.containsValue("Sabin"));

        // Size
        System.out.println("Size: " + map.size());

        // Update value
        map.put(102, "Pabin");
        System.out.println("After update: " + map);

        // Remove
        map.remove(103);
        System.out.println("After remove: " + map);

        // Iterate
        System.out.println("All entries:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}