package session10.challenges.vehicles.multilevel_inheritance;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Get ready to race!");
    }

    public void stop() {
        System.out.println("Taking a brake here");
    }

    public void accelerate() {
        System.out.println("Let's speed up!");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
