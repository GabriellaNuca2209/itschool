package session11.challenges.challenge02;

public class BankC extends Bank {

    private double balance;

    public BankC(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
