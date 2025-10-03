/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class Transpose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Trans(arr);
    }
    public static void Trans(int[][] arr) {
        int[][] arr2 = new int[arr[0].length][arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                int x = arr[i][j];
                arr2[j][i] = x;
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

    }

}
