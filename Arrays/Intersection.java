package Arrays;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class Intersection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        comman(arr, arr2);

    }
    public static void comman(int[] arr,int[] arr2){
        for (int k : arr) {
            for (int i : arr2) {
                if (k == i) {
                    System.out.println(k);
                }
            }
        }
    }

}
