package session10.challenges.vehicles.single_inheritance;

import java.util.List;

public class MountainBike extends Bicycle {

    private String tireType;
    private int suspension;

    public MountainBike(double speed, int gear, List<Integer> gearScope, String tireType, int suspension) {
        super(speed, gear, gearScope);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public int adjustSuspension(int suspensionNum) {
        return suspension = suspensionNum;
    }

    public String getTireType() {
        return tireType;
    }

    public int getSuspension() {
        return suspension;
    }
}
