/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package StringQuestion;

/**
 *
 * @author akshitm
 */
public class longestLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Hello Akshit What are you doing";
        System.out.println(cot(s));
    }
    public static int cot(String s) {
        int count = 0;
        int l = s.length();
        int start = 0;
        int end = 0;
        int ml = 0;
        int max = 0;
        while(end<l){
            if(s.charAt(end) != ' ')
            {
                end++;
            }else{
                ml = end-start;
                start = end+1;
                end++;
            }
            max = Math.max(max, ml);
        }
        count = max;
        return count;
    }

}
