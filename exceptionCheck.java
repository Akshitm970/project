//import static jdk.jfr.internal.util.SpellChecker.check;

public class exceptionCheck {
    static int balance = 10;
    public static void main(String[] args) {

        int withdrawl = 20;
        try
        {
            check(withdrawl);

        }
        catch (InsufficientBalanceException e){
            System.out.println("InsufficientBalanceException");
        }

    }
    public static void check(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
    }

}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}