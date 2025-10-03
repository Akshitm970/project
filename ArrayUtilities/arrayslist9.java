package ArrayUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayslist9 {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Cherry"};
        List<String> list = new ArrayList<String>();
        list = Arrays.asList(arr);
        System.out.println(list);
    }
}
