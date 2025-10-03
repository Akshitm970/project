import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class prac2 {
    String a;

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        List<Integer> oddl = new ArrayList<Integer>();
        List<Integer> evenl = new ArrayList<Integer>();
        List<Integer> prime = new ArrayList<Integer>();
        List<Integer> composite = new ArrayList<Integer>();
//        composite.add(1);
//        evenl.add(1);
//        oddl.add(1);

        for(int i = 2;i<100;i++){
            int a = ran();
            ls.add(a);
        if(odd(a)){
            oddl.add(a);
            if(isprime(a)){
                prime.add(a);
            } else{
                composite.add(a);
            }
        } else if (even(a)) {
            evenl.add(a);
            if(a!=2){
                composite.add(a);
            }
        }

        }
        System.out.println("List of all number "+ ls);
        System.out.println("Odd number list"+oddl);
        System.out.println("Even number list"+evenl);
        System.out.println("Prime number list"+prime);
        System.out.println("Composite list"+composite);
    }
    public static int ran(){
        return (int)(Math.random()*100);
    }


    public static boolean odd(int a){
        if(a%2!=0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean even(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isprime(int a){
        if(a<=1){
            return false;
        }
        if(a == 2){
            return true;
        }
        if(a%2==0){
            return false;
        }
        for(int i = 3;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }


}
