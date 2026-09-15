import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Std9 {
    int rollNo;
    String name;
    double marks;

    Std9(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class MultiCompareDemo {
    public static void main(String[] args) {
        ArrayList<Std9> list = new ArrayList<>();

        list.add(new Std9(101, "Savin", 85.5));
        list.add(new Std9(102, "Nabin", 92.0));
        list.add(new Std9(103, "Sabin", 78.5));
        list.add(new Std9(104, "Pabin", 85.5));

        Collections.sort(list, new Comparator<Std9>() {
            public int compare(Std9 s1, Std9 s2) {
                int nameCompare = s1.name.compareTo(s2.name);
                if (nameCompare != 0) {
                    return nameCompare;
                }
                return Double.compare(s1.marks, s2.marks);
            }
        });

        System.out.println("Sorted by Name then Marks:");
        for (Std9 s : list) {
            System.out.println(s.rollNo + " - " + s.name + " - " + s.marks);
        }
    }
}