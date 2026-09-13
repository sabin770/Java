// Question 7: Write a Java program to append data to an existing file.

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt", true);
            fw.write("\nNew data appended");
            fw.close();
            System.out.println("Data appended successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}