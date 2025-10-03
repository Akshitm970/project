public class prac3 {
    public static void main(String[] args) {
        int a = fact(5);
        System.out.println(a);
    }
    public static int fact(int n){
        if(n <= 1){
            return n;
        }
        return n*fact(n-1);
    }
}
