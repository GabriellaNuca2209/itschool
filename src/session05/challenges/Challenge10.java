package session05.challenges;

import java.util.Objects;
import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print Hello World" + "\n" + "Print the users name" + "\n" + "Exit");
        String userInput = scanner.nextLine();

        while (!Objects.equals(userInput, "Exit")) {
            switch (userInput) {
                case "Print Hello World":
                    System.out.println("Hello World");
                    break;
                case "Print the user name":
                    System.out.println("Gabriella");
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
            System.out.println("Print Hello World" + "\n" + "Print the user name" + "\n" + "Exit");
            userInput = scanner.nextLine();
        }
        System.out.println("Bye, friend!");
    }
}
