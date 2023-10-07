package session11.challenges.challenge02;

public class BankApp {

    public static void main(String[] args) {
        BankA mark = new BankA(100);
        BankB anny = new BankB(150);
        BankC susan = new BankC(200);

        System.out.println(mark.getBalance());
        System.out.println(anny.getBalance());
        System.out.println(susan.getBalance());
    }
}
