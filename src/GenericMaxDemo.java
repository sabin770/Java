public class GenericMaxDemo {
    static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of 10, 20, 15: " + findMax(10, 20, 15));
        System.out.println("Max of 3.5, 2.8, 4.2: " + findMax(3.5, 2.8, 4.2));
        System.out.println("Max of Apple, Mango, Banana: " + findMax("Apple", "Mango", "Banana"));
    }
}
