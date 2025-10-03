package StringQuestion;

public class reversestring {
    public static void main(String[] args) {
        String s = "Infinite";
        StringBuilder k = new StringBuilder();
        for(int i = s.length()-1;i>0;i--){
            k.append(s.charAt(i));
        }
        System.out.println(k);
    }
}
