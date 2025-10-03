package Arrays;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sorting(arr);
        for (int i : arr) {
            System.out.println(i);

        }
    }

    public static void sorting(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
