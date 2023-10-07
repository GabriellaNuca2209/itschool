package session11.challenges.challenge02;

public class BankB extends Bank {

    private double balance;

    public BankB(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
