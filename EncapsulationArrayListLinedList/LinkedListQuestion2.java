package EncapsulationArrayListLinedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListQuestion2 {
    public static void main(String[] args) {
        List<Integer> ls = new LinkedList<Integer>();
        for(int i = 0; i < 10; i++){
            ls.add(i);
        }
        System.out.println(ls);
        for(int i = 0;i<ls.size();i++){
            if(ls.get(i)%2!=0){
                ls.remove(i);
            }
        }
        System.out.println(ls);

    }
}
