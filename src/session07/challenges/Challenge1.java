package session07.challenges;

import java.time.LocalDate;

public class Challenge1 {

    public static void main(String[] args) {
        displayTodaysDate();
    }

    public static void displayTodaysDate() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}
