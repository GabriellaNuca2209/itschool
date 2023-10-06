package session10.challenges.animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Meow");
    }
}
