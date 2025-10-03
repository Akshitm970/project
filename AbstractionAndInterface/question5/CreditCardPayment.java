package AbstractionAndInterface.question5;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("The Credit card is ready to use");
    }
}
