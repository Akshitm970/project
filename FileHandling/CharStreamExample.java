package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {
    public static void main(String[] args) {
        try {
            // Write characters
            FileWriter writer = new FileWriter("test2.txt");
            writer.write("Character Stream Example");
            writer.close();

            // Read characters
            FileReader reader = new FileReader("test2.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
