package session10.challenges.animals;

public class Wolf extends Animal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Howl");
    }
}
