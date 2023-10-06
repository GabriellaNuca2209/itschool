package session10.challenges.animals;

public class TestAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog("Sparky");
        Cat cat = new Cat("Sushi");
        Wolf wolf = new Wolf("Caesar");

        dog.sound();
        cat.sound();
        wolf.sound();
    }
}
