import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessUpdateDemo {
    public static void main(String[] args) {
        try {
            // Write record
            RandomAccessFile raf = new RandomAccessFile("data.txt", "rw");

            raf.writeInt(101);
            raf.writeUTF("Sabin");
            raf.writeDouble(50000);

            raf.close();

            // Read and update record
            raf = new RandomAccessFile("data.txt", "rw");

            int id = raf.readInt();
            String name = raf.readUTF();
            double salary = raf.readDouble();

            System.out.println("Before Update:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);

            // Update salary
            raf.seek(4 + 2 + name.length() + 2);
            raf.writeDouble(75000);

            // Read updated record
            raf.seek(0);
            id = raf.readInt();
            name = raf.readUTF();
            salary = raf.readDouble();

            System.out.println("\nAfter Update:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);

            raf.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}