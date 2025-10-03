/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
import java.util.*;
public class freqElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};
        countFreq(arr);
    }

    public static void countFreq(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr[arr.length-1]+1];
        for(int i = 0;i<arr.length;i++){
            int x = arr[i];
            arr2[x]++;
        }
        for(int i = 0;i<arr2.length;i++){
            if((arr2[i])!=0){
                System.out.println(i+" "+arr2[i]);
            }
        }
    }

}
