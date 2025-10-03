package StringQuestion;
class ifContainsDigit{
    public static void main(String[] args){
        String s = "123a33";
        System.out.println(contains(s));
        
    }
    public static boolean contains(String s){
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
           if(!Character.isDigit(a)){
                return false;
            }
        }
        return true;
    }
}