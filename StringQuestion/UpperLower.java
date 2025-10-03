package StringQuestion;

public class UpperLower {
    public static void main(String args[]){
        String s = "Akshit";
        String upper = tou(s);
        String lower = tol(s);
        
        System.out.println(upper);
        System.out.println(lower);
    }
    public static String tou(String s) {
        String upper = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                upper += s.charAt(i);
                continue;
            }else{
               char a = (char)(s.charAt(i)-32);
               upper += a;
            }
        }
        return upper;
    }
    public static String tol(String s) {
        String lower = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                lower += s.charAt(i);
                continue;
            }else{
               char a = (char)(s.charAt(i)+32);
               lower += a;
            }
        }
        return lower;
    }
}
