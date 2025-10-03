interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }
}

public class AbstractionAbstractClassInterface {
    public static void main(String[] args) {
        Payment p = new UPI(); // abstraction
        p.pay(2000);
    }
}
