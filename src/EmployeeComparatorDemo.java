import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp1 {
    int empId;
    String name;
    double salary;

    Emp1(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Emp1> list = new ArrayList<>();

        list.add(new Emp1(101, "Sabin", 50000));
        list.add(new Emp1(102, "Savin", 75000));
        list.add(new Emp1(103, "Pavin", 45000));

        Collections.sort(list, new Comparator<Emp1>() {
            public int compare(Emp1 e1, Emp1 e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("Sorted by Salary:");
        for (Emp1 e : list) {
            System.out.println(e.empId + " - " + e.name + " - $" + e.salary);
        }
    }
}