public class evenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = cou(arr);
        System.out.println("Even : "+n);
        System.out.println("odd : "+(arr.length-n));
    }
    public static int cou(int[] arr){
        int count = 0;
        for(int i : arr){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
}
