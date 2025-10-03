/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class rowMajor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] myMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printRowMajorarr(myMatrix);
        System.out.println();
        printColMajorarr(myMatrix);
    }
    public static void printRowMajorarr(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void printColMajorarr(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
