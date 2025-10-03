package StringQuestion;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.HashSet;

/**
 *
 * @author akshitm
 */
public class removeduplicate {
    public static void main(String[] args) {
        String s = "Akshit Mittal";
        HashSet<Character> l = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            l.add(s.charAt(i));   
        }
        System.out.println(l);
    }
}
