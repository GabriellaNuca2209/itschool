package session10.challenges.vehicles.hierarchical_inheritance;

public class SpeedBoat extends Boat {

    private int maxSpeed;
    private String engineType;

    public SpeedBoat(double length, double weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost() {
        System.out.println("This boat is fast!");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }
}
