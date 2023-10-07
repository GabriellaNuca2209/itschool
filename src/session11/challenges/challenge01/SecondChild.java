package session11.challenges.challenge01;

public class SecondChild extends Parent {

    private String name;

    public SecondChild(String name) {
        this.name = name;
    }

    @Override
    public void message() {
        System.out.println("This is second subclass");
    }
}
