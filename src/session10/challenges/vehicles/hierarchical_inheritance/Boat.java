package session10.challenges.vehicles.hierarchical_inheritance;

public class Boat {

    private double length;
    private double weight;

    public Boat(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail() {
        System.out.println("Boat is sailing");
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }
}
