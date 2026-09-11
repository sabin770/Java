import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write("Hello Java");
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (FileReader fr = new FileReader("data.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}