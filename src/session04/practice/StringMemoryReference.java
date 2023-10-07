package session04.practice;

public class StringMemoryReference {

    public static void main(String[] args) {
        String greeting = new String("Hello");
        String greeting1 = "hello";
        String greeting2 = "Hello";

        System.out.println(greeting1 == greeting2);
        System.out.println(greeting1.equalsIgnoreCase(greeting2));

        System.out.println(greeting == greeting1);
        System.out.println(greeting.equals(greeting1));

        int number1 = 10;
        double number2 = 123.2;
        System.out.println(number1 == number2);
    }
}
