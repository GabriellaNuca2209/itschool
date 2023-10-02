package session9.challenges.simple_banking_app;

import java.util.UUID;

public class BankingApp {

    public static void main(String[] args) {
        User joe = new User(UUID.randomUUID(), "Joe", "William", 40);

        System.out.println(joe.getBalance());

        joe.deposit(20);
        joe.deposit(5);
        joe.withdraw(13.5);
        joe.viewSummary();
    }
}
