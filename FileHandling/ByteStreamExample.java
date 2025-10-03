package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try{
            // Write data to file
            FileOutputStream fout = new FileOutputStream("test.txt");
            String str = "Hello, Java Streams!";
            fout.write(str.getBytes());  // convert string to bytes
            fout.close();

            // Read data from file
            FileInputStream fin = new FileInputStream("test.txt");
            int i;
            while ((i = fin.read()) != -1) {  // read byte by byte
                System.out.print((char) i);
            }
            fin.close();
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
