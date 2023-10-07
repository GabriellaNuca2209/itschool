package session05.challenges;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers to add.");
        int number = scanner.nextInt();

        int sum = 0;
        int counter = 0;
        while (number != 0) {
            sum += number;
            System.out.println("Continue. To stop, type 0.");
            number = scanner.nextInt();
            counter++;
        }
        scanner.close();

        int result = sum / counter;
        System.out.println("Average: " + result);
    }
}
