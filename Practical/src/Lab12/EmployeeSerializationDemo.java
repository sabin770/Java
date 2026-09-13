// Question 5: Write a Java program to store employee records using serialization.

import java.io.*;

class Employee1 implements Serializable {
    int empId;
    String name;
    String department;
    double salary;

    Employee1(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerializationDemo {
    public static void main(String[] args) throws Exception {
        Employee1[] emp = {
                new Employee1(101, "Sabin", "IT", 50000),
                new Employee1(102, "Savin", "HR", 45000),
                new Employee1(103, "Pabin", "Finance", 60000)
        };

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.txt"));
        for (Employee1 e : emp) oos.writeObject(e);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.txt"));
        for (int i = 0; i < 3; i++) {
            Employee1 e = (Employee1) ois.readObject();
            System.out.println(e.empId + " - " + e.name + " - " + e.department + " - $" + e.salary);
        }
        ois.close();
    }
}