import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student6 s = (Student6) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Roll No: " + s.rollNo);
            System.out.println("Name: " + s.name);
            System.out.println("Course: " + s.course);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}