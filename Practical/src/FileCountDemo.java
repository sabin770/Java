import java.io.FileReader;
import java.io.IOException;

public class FileCountDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
            int chars = 0, words = 0, lines = 0;
            int i;
            boolean inWord = false;

            while ((i = fr.read()) != -1) {
                chars++;
                char ch = (char) i;

                if (ch == '\n') lines++;

                if (ch == ' ' || ch == '\n' || ch == '\t') {
                    inWord = false;
                } else if (!inWord) {
                    words++;
                    inWord = true;
                }
            }
            lines++;

            fr.close();

            System.out.println("Characters: " + chars);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}