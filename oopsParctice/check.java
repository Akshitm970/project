package oopsParctice;

//import java.io.IO;
import java.util.ArrayList;
import java.util.HashMap;

//import static java.io.IO.println;

public class check {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println();
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(1,2);
        hs.put(2,2);
        hs.put(3,3);
        hs.put(4,4);
//        System.out.println(hs.compute());
//        IO.println(2);
        int a1 = hs.get(1);
        System.out.println(a1);
    }
}
