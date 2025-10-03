package ArrayUtilities;

import java.util.Arrays;

public class arraycopy6 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30} ;
        int[] arr2 = new int[arr.length];

        arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));

    }
}
