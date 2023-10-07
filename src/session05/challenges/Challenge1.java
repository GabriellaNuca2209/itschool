package session05.challenges;

public class Challenge1 {

    public static void main(String[] args) {
        checkEvenOrOdd(17);
    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
