package session05.challenges;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers to add.");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != -1) {
            sum += number;
            System.out.println("Continue. To stop, type -1.");
            number = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
