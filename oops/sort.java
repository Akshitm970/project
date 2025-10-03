package oops;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(List.of("Akshit","1"));
        list.add(List.of("Ravi","2"));
        list.add(List.of("Ravi","4"));
        list.add(List.of("k","3"));

        list.remove(2);

        for(List<String> l : list){
            System.out.println(l.get(0)+" "+l.get(1) );
        }

    }
}
