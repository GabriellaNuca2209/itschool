package session10.challenges.bank_account;

import java.util.UUID;

public class BankApp {

    public static void main(String[] args) {
        BankAccount mark = new BankAccount("Mark Sauce", UUID.randomUUID(), 500);
        BankAccount jenny = new BankAccount("Jenny Soy", UUID.randomUUID(), 200);

        mark.deposit(100);
        mark.withdraw(50);
        System.out.println(mark.getBalance());
        mark.getAccountDetails();

        // transfer test
        mark.transferFunds(jenny, 100.50);
        System.out.println(jenny.getBalance());
        System.out.println(mark.getBalance());

        // testing validations
        mark.deposit(-10);
        mark.withdraw(-5);
        mark.withdraw(700);
        mark.transferFunds(jenny, -250);
    }
}
