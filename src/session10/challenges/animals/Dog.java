package session10.challenges.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
