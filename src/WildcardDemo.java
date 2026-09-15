import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    static void display(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println("String List:");
        display(strList);

        System.out.println("\nInteger List:");
        display(intList);

        System.out.println("\nSum: " + sum(intList));
    }
}