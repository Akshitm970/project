package StringQuestion;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class vowelsConsonants {
    public static void main(String[] args) {
        String s = "akshit";
        s.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e'||s.charAt(i)=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
    }
}
