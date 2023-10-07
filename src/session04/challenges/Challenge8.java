package session04.challenges;

public class Challenge8 {

    public static void main(String[] args) {
        int number = 4;
        int result = number;
        for (int i = 1; i < number; i++) {
            result *= i;
        }
        System.out.println(number + "! = " + result);
    }
}
