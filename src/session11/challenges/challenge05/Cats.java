package session11.challenges.challenge05;

public class Cats extends Animals {

    public Cats() {
        System.out.println("This is the cat class");
    }

    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {
        System.out.println("Cats don't like dogs");
    }
}
