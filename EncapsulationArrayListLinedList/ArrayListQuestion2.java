package EncapsulationArrayListLinedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListQuestion2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        for (int i = 0;i<5;i++){
//            char o = (char)('a'+i);
//            list.add(String.valueOf(o));
//        }
        list.add("Akshit");
        list.add("Mittal");
        list.add("Kumar");
        list.add("Naman");
        list.add("Ritik");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.remove("Ritik");
        System.out.println(
                list
        );
    }
}
