package EncapsulationArrayListLinedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListQuestion1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i>0; i--){
            list.add(i);
            if(i%2==0){
                System.out.println(list.get(list.size()-1));
            }
        }

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
