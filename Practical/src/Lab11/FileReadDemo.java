// Question 2: Write a Java program to read a file using FileInputStream.

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}