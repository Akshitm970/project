/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package StringQuestion;

/**
 *
 * @author akshitm
 */
public class count {
    public static void main(String[] args) {
        String s = "Akshit what are you doing";
        int co = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                co++;
            }
        }
        System.out.println(co);
    }

}
