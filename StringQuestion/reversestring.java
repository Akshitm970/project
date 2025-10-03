package StringQuestion;

public class reversestring {
    public static void main(String[] args) {
        String s = "Infinite";
        String k = "";
        for(int i = s.length()-1;i>0;i--){
            k += s.charAt(i);
        }
        System.out.println(k);
    }
}
