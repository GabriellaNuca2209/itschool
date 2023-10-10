package session12_polymorphism.practice.runtime_polymorphism.animals;

public class Dog extends Animal {

    // method overriding - runtime polymorphism
    @Override
    public String sound() {
        return "Dog barks";
    }
}
