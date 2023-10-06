package session10.challenges.vehicles.single_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Bicycle {

    private double speed;
    private int gear;

    private List<Integer> gearScope = new ArrayList<>();

    public Bicycle(double speed, int gear, List<Integer> gearScope) {
        this.speed = speed;
        this.gear = gear;
        this.gearScope = gearScope;
    }

    public int changeGear(int gearNum) {
        if (gearScope.contains(gearNum)) {
            return gear = gearScope.get(gearNum - 1);
        }
        System.out.println("Invalid gear");
        return -1;
    }

    public double speedUp() {
        return speed += 10;
    }

    public double applyBrake() {
        return speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
