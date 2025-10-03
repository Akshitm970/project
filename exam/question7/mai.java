package exam.question7;

import java.util.*;

public class mai {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);

        HashSet<String> hs = new HashSet<>();
        LinkedList list2 = new LinkedList();

        Iterator i = list.iterator();
        while (i.hasNext()) {
            hs.add(i.toString());
            i.next();
        }

        System.out.println(list);
        for(String s: hs) {
            System.out.println(s);
        }
        System.out.println(list);

    }
}
