package session04.practice;

public class MemoryReference {

    public static void main(String[] args) {
        Animal lion1 = new Animal();
        System.out.println(lion1.name);
        lion1.setName("Simba");

        Animal lion2 = new Animal();
        lion2.setName("Simba");

        Animal lion3 = new Animal();
        lion3.setName("Simba");

        System.out.println(lion2 == lion3);
        System.out.println(lion2.equals(lion3));

        Animal lion4 = new Animal();
        lion4.setAge(10);

        Animal lion5 = new Animal();
        lion5.setAge(5);

        System.out.println("Animals with different age: " + lion4.equals(lion5));

    }
}
