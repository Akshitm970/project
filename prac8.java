import java.util.HashMap;
import java.util.Map;

public class prac8 {
    public static void main(String[] args) {
        String s = "This is sample statement";
        Map<Character,Integer> hs = new HashMap<>();
        for(char c : s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        hs.remove(' ');
        System.out.println(hs);
    }
}
