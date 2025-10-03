/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "    Infinite Computer     ";
        t(s);

        String a = "Infinite Computer";
        String b = a.toUpperCase();
        equalsIgnorecas(a,b);
    }

    public static void t(String s){
        String a = s.trim();
        System.out.println(a);

    }
    public static void equalsIgnorecas(String s,String s2){
        System.out.println(s.equalsIgnoreCase(s2));

    }
    public static void sub(String a){
        a.substring(2, 4);
    }

    public static String a(StringBuilder s){
        s.ensureCapacity(4);
        return s.toString();
    }


}