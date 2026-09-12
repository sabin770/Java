import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessDemo {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");

            raf.writeInt(101);
            raf.writeUTF("Savin");
            raf.writeDouble(50000);

            raf.seek(0);

            int id = raf.readInt();
            String name = raf.readUTF();
            double salary = raf.readDouble();

            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);

            raf.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}