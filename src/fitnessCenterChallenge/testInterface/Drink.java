package fitnessCenterChallenge.testInterface;

public class Drink implements Item2 {

    private String name;

    @Override
    public void use() {
        System.out.println("I am using the drink, not drinking");
    }
}
