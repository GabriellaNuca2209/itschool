package session11.challenges.challenge02;

public class BankA extends Bank {

    private double balance;

    public BankA(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
