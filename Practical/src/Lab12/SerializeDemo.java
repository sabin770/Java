// Question 1: Create a Serializable Student class and serialize a Student object.

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student6 s = new Student6(101, "Savin", "CS");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);

            oos.close();
            fos.close();

            System.out.println("Object serialized successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}