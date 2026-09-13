// Question 3: Write a Java program to copy one file into another using byte streams.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            FileOutputStream fos = new FileOutputStream("copy.txt");

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }

            fis.close();
            fos.close();
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}