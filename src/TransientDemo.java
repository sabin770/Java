import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class Std3 implements Serializable {
    int rollNo;
    String name;
    transient String password;

    Std3(int rollNo, String name, String password) {
        this.rollNo = rollNo;
        this.name = name;
        this.password = password;
    }
}

public class TransientDemo {
    public static void main(String[] args) {
        try {
            // Serialize
            Std3 s1 = new Std3(101, "Savin", "secret123");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Before Serialization:");
            System.out.println("Roll No: " + s1.rollNo);
            System.out.println("Name: " + s1.name);
            System.out.println("Password: " + s1.password);

            // Deserialize
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Std3 s2 = (Std3) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nAfter Deserialization:");
            System.out.println("Roll No: " + s2.rollNo);
            System.out.println("Name: " + s2.name);
            System.out.println("Password: " + s2.password);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}