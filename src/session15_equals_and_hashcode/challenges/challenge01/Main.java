package session15_equals_and_hashcode.challenges.challenge01;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(22, 15);
        Rectangle rectangle2 = new Rectangle(22, 15);

        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
    }
}
