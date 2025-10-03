package EncapsulationArrayListLinedList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuestion3 {
    public static void main(String[] args) {
        List<Integer> ls1 =  new ArrayList<Integer>();
        List<Integer> ls2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            ls1.add(i);
            ls2.add(i);
        }
        ls1.addAll(ls2);
        System.out.println(ls1);
    }
}
