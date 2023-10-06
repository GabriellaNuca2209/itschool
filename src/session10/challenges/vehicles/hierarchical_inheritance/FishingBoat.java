package session10.challenges.vehicles.hierarchical_inheritance;

public class FishingBoat extends Boat {

    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat(double length, double weight, int fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("Fishing here");
    }

    public int getFishCapacity() {
        return fishCapacity;
    }

    public String getTypeOfNet() {
        return typeOfNet;
    }

    public void setTypeOfNet(String typeOfNet) {
        this.typeOfNet = typeOfNet;
    }
}
