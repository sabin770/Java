class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(101, "Savin");
        p1.display();

        Pair<String, Double> p2 = new Pair<>("Price", 99.99);
        p2.display();

        Pair<String, String> p3 = new Pair<>("Country", "Nepal");
        p3.display();
    }
}