
import java.util.*;
public class primeReverse {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start < end) {
//            while (start < end && !prime(arr[start])) {
//                start++;
//            }
//            while (start < end && !prime(arr[end])) {
//                end--;
//            }
//            if (start < end) {
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println(null.toString());

        int[] arr = {1,2};

       check(arr);
    }
    public static void check(int[] arr){
        for (int i = 0; i<3; i++){
            try{
                System.out.println(arr[i]);

            }
            catch(ArithmeticException e){
                System.out.println(e);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e+" Dont worry");
                throw  new ArithmeticException();
            } catch (NullPointerException e) {
                System.out.println(e);
            }catch (Exception e){
                System.out.println(e);
            }
            finally {

            }System.out.println("This is finally block");

        }
    }
    public static boolean prime(int a){
        if (a < 2) return false;
        for(int i = 2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
    return true;
    }

}
