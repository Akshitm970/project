package AbstractionAndInterface.question5;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("The upi is ready to use");
    }
}
