/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
import java.util.*;
public class shiftZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,0,0,6,4,0,5};
        shift(arr);
    }
    public static void shift(int[] arr) {
        int[] arr2 = new int[arr.length];
        Arrays.fill(arr2, 0);
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr2[k] = arr[i];
                k++;
            }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr2[idx]);
            
        }
    }

}
