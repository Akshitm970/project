package EncapsulationArrayListLinedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListQuestion1 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Delhi");

        System.out.println(list);
        list.add("Goa");

        System.out.println(list);
        list.add("Agra");

        System.out.println(list);
        list.add("Nagpur");

        System.out.println(list);
        list.add("Mumbai");

        System.out.println(list);
        list.addFirst("MZN");
        System.out.println(list);
        list.addLast("Devband");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
