package AbstractionAndInterface.question7;

public abstract class BankAccount {
    public abstract void deposit();
    public abstract void withdraw();
}
 class SavingAccount extends BankAccount {

     @Override
     public void deposit() {
         System.out.println("The amount was deposited in the SavingAccount");
     }

     @Override
     public void withdraw() {
         System.out.println("The amount withdrawn from SavingAccount");
     }
 }

class CurrentAccount extends BankAccount {

    @Override
    public void deposit() {
        System.out.println("The amount was deposited in the CurrentAccount");
    }

    @Override
    public void withdraw() {
        System.out.println("The amount withdrawn from CurrentAccount");
    }
}