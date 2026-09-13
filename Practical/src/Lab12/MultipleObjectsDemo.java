// Question 3: Write a Java program to serialize and deserialize multiple objects.

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class Student7 implements Serializable {
    int rollNo;
    String name;

    Student7(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class MultipleObjectsDemo {
    public static void main(String[] args) {
        try {
            // Serialize multiple objects
            Student7 s1 = new Student7(101, "Sabin");
            Student7 s2 = new Student7(102, "Savin");
            Student7 s3 = new Student7(103, "Pabin");

            FileOutputStream fos = new FileOutputStream("students.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);

            oos.close();
            fos.close();

            System.out.println("Objects serialized successfully");

            // Deserialize multiple objects
            FileInputStream fis = new FileInputStream("students.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student7 r1 = (Student7) ois.readObject();
            Student7 r2 = (Student7) ois.readObject();
            Student7 r3 = (Student7) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nDeserialized Student7s:");
            System.out.println(r1.rollNo + " - " + r1.name);
            System.out.println(r2.rollNo + " - " + r2.name);
            System.out.println(r3.rollNo + " - " + r3.name);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}