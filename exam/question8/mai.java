package exam.question8;

import java.util.*;

public class mai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        TreeSet<Character> set = new TreeSet<>();
        for (char c : map.keySet()) {
            set.add(c);
        }
        System.out.println(map);
        System.out.println(set);
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            String s1 = "";
            while(s.charAt(i)!=' ' || i < s.length()-1){
                s1+=s.charAt(i);
                i++;
            }
            map2.put(s1,map.get(s1)+1);
        }
        System.out.println(map2);
    }

}
