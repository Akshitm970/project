public class exeption2 {
    public static void main(String[] args) {
        int a = 25;
        int b = -9;
        try {
            findSquareRoot(a);
            findSquareRoot(b);
        } catch (NegativeNumber e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void findSquareRoot(int a) {
        if (a < 0) {
            throw new NegativeNumber("Square root of negative number is not allowed: " + a);
        }
        System.out.println("Square root of " + a + " = " + Math.sqrt(a));
    }
}
class NegativeNumber extends RuntimeException {
    public NegativeNumber(String message) {
        super(message);
    }
}
