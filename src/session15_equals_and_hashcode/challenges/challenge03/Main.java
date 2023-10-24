package session15_equals_and_hashcode.challenges.challenge03;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 23, 1, "someemail@email.com");
        Student student2 = new Student("Alice", 23, 2, "someemail@email.com");

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
