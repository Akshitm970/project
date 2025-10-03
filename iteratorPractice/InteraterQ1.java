package iteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteraterQ1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();   // no casting needed
            if (i == 2) {
                it.remove();
            }
        }
        System.out.println(list);

    }
}
