// import java.lang.reflect.Array;
// import java.util.*;


class reverseInteger{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i : rev(arr)){
            System.out.println(i);
        }
    }
    public static int[] rev(int[] arr) {
        int m = arr.length-1;
        int[] a = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            a[i] = arr[m-i];
        }
        return a;
    }
    

}