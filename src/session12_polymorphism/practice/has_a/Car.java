package session12_polymorphism.practice.has_a;

public class Car {

    private session12_polymorphism.practice.has_a.Engine engine; // using composition, car HAS-A Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }

    void drive() {
        System.out.println("Car is driving");
    }
}
