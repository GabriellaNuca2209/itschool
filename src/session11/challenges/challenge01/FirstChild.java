package session11.challenges.challenge01;

public class FirstChild extends Parent {

    private String name;

    public FirstChild(String name) {
        this.name = name;
    }

    @Override
    public void message() {
        System.out.println("This is first subclass");
    }
}
