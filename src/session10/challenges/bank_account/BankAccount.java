package session10.challenges.bank_account;

import java.util.UUID;

public class BankAccount {

    private String accountHolderName;
    private final UUID accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, UUID accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You've deposited " + amount + "$");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You've withdrew " + amount + "$");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0) {
            targetAccount.deposit(amount);
            balance -= amount;
            System.out.println("Transferred " + amount + "$ in " + targetAccount.getAccountHolderName() + "'s account");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getAccountDetails() {
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("ID: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
