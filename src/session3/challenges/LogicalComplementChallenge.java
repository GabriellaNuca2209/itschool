package session3.challenges;

import java.util.Scanner;

public class LogicalComplementChallenge {

    public static void main(String[] args) {
        String result = isPositiveOrNegative(-4);
        System.out.println("The number is " + result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first boolean");
        boolean bool1 = scanner.nextBoolean();
        System.out.println("Type second boolean");
        boolean bool2 = scanner.nextBoolean();

        System.out.println(bool1 + " -> " + !bool1);
        System.out.println(bool2 + " -> " + !bool2);

        scanner.close();
    }

    public static String isPositiveOrNegative(int number) {
        if (number > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
}
