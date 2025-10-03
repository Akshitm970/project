/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package StringQuestion;

/**
 *
 * @author akshitm
 */
public class removespace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Hello Akshit What are you doing";
        String a ="";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                a+=s.charAt(i);
            }
        }
        System.out.println(a);
    }

}
