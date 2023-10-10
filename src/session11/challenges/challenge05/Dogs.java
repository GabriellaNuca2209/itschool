package session11.challenges.challenge05;

public class Dogs extends Animals {

    public Dogs() {
        System.out.println("This is the dog class");
    }

    @Override
    public void cats() {
        System.out.println("Dogs don't like cats");
    }

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }
}
