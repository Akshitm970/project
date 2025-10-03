
import java.util.Arrays;

class maxMin{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        int max = max(arr);
        int min = min(arr);
        System.out.println(max);
        System.out.println(min);
    }    
    public static int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int min(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}