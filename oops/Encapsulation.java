/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author akshitm
 */
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(5000);
        System.out.println(acc.getBalance()); // 5000
    }
}

class BankAccount {
    private double balance;  // hidden (Encapsulation)

    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}