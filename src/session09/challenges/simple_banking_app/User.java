package session09.challenges.simple_banking_app;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private final UUID uuid;
    private String firstName;
    private String lastName;
    private double balance;
    private List<String> transactionSummary = new ArrayList<>();

    public User(UUID uuid, String firstName, String lastName, double balance) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public double deposit(double money) {
        transactionSummary.add("Deposited " + money + "$, balance: " + (balance + money) + "$");
        return balance += money;
    }

    public double withdraw(double money) {
        transactionSummary.add("Withdraw " + money + "$, balance: " + (balance - money) + "$");
        return balance -= money;
    }

    public void viewSummary() {
        for (String transaction : transactionSummary) {
            System.out.println(transaction);
        }
        System.out.println("Balance: " + balance + "$");
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                ", transactionSummary=" + transactionSummary +
                '}';
    }
}
