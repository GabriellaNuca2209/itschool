package session10.challenges.vehicles.single_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Depot {

    public static void main(String[] args) {
        List<Integer> newGearScope = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        MountainBike speedRunner = new MountainBike(20, 5, newGearScope, "The Good One", 10);

        System.out.println(speedRunner.getSpeed());
        System.out.println(speedRunner.speedUp());
        System.out.println(speedRunner.applyBrake());
        System.out.println(speedRunner.getGear());
        System.out.println(speedRunner.changeGear(6));
        System.out.println(speedRunner.changeGear(11));
    }
}
