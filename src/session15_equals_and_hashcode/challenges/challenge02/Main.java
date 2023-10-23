package session15_equals_and_hashcode.challenges.challenge02;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Jane", 22, "someemail@email.com");
        Person person2 = new Person("Jane", 22, "someotheremail@email.com");

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
