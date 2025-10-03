package StringQuestion;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "naman";
        String b = "akshit";
        System.out.println(palind(a));
        System.out.println(palind(b));
    }
    public static boolean palind(String a){
        String s = "";
        for(int i = a.length()-1;i>=0;i--){
            s+=a.charAt(i);
        }
        return a.equals(s);
    }

}
