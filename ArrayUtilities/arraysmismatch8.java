package ArrayUtilities;

import java.util.Arrays;

public class arraysmismatch8 {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4};
        int[] arr2 = {1, 2, 5, 6};
        int a = Arrays.mismatch(arr,arr2);
        System.out.println(a);
    }
}
