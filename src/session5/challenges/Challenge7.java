package session5.challenges;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, there! Let's play a game! I choose a number and you have to guess it");
        int numberToGuess = 20;
        int playerNumber = scanner.nextInt();

        while (playerNumber != numberToGuess) {
            if (playerNumber > numberToGuess) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }
            System.out.println("Try again!");
            playerNumber = scanner.nextInt();
        }
        scanner.close();
        System.out.println("You guessed! The number was indeed " + numberToGuess);
    }
}
