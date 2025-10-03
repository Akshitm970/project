/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package StringQuestion;

/**
 *
 * @author akshitm
 */
public class frequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Hello Akshit What are you doing";
        int[] arr = new int[26]; 

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
           
            if (Character.isLetter(currentChar)) {
                int index = Character.toLowerCase(currentChar) - 'a'; 
                if (index >= 0 && index < 26) { 
                    arr[index]++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) { 
                System.out.println((char) ('a' + i) + ": " + arr[i]);
            }
        }
    }
    }


