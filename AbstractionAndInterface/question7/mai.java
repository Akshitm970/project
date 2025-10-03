package AbstractionAndInterface.question7;

public class mai {
    public static void main(String[] args) {
        SavingAccount b = new SavingAccount();

        BankAccount b1 = new CurrentAccount();

        b.withdraw();
        b1.deposit();
        b.deposit();
        b1.withdraw();

    }
}
