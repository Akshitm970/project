package AbstractionAndInterface.question5;

public class main {
    public static void main(String[] args) {
        CreditCardPayment p = new CreditCardPayment();
        UPIPayment p1 = new UPIPayment();
        p.pay();
        p1.pay();
    }

}
