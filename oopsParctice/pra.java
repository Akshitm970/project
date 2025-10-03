package oopsParctice;

import java.io.FileReader;

public class pra {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\akshitm\\project\\Array_Akshit_Mittal.txt");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
