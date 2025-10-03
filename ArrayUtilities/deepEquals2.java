package ArrayUtilities;

import java.util.Arrays;

public class deepEquals2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int[][] arr2 = {{1,2},{3,4}};
        System.out.println(Arrays.deepEquals(arr, arr2));
    }
}
