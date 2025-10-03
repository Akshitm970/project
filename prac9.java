import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class prac9 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            ls.add(i);
        }
//        for (int j : ls){
//            System.out.print(j+" ");
//        }
//        ls.forEach(num-> {
//            System.out.println( num%2==0 ? (num) :"garbage");
//        });

        ls.parallelStream().forEach(num -> {
            System.out.println(num % 2 == 0 ? (num) : "garbage");
        });
    }
}