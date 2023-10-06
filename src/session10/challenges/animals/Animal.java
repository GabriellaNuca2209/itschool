package session10.challenges.animals;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animals make sounds");
    }

    public String getName() {
        return name;
    }
}
