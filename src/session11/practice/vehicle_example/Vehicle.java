package session11.practice.vehicle_example;

public abstract class Vehicle {

    int speed;

    abstract void accelerate();

    abstract void brake();

    void retractableHood() {
        System.out.println("Hood on/off");
    }
}
