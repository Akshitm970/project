/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class Merge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr3 = new int[arr.length+arr2.length];
        int index = 0;
        for(int i : arr){
            arr3[index] = i;
            index++;
        }
        for(int i : arr2){
            arr3[index] = i;
            index++;
        }

        for(int i : arr3){
            System.out.println(i);
        }
    }

}
