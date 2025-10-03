package exam.question10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FileWordProcessor {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        try {

//            FileReader f = new FileReader("file.txt");
            Scanner sc = new Scanner("file.txt");
            Scanner sc2 = new Scanner(System.in);
            for (char a : sc.nextLine().toCharArray()) {
                if(!map.containsKey(a)) {
                    list.add(a);
                }
                map.put( a, map.size());

            }
            System.out.println("Enter word to add");
            String a = sc2.nextLine();
            System.out.println(a);


        }

        catch (Exception e){
        e.printStackTrace();
        }
        finally {
            System.out.println(list);
            System.out.println(map);
        }
    }
}

