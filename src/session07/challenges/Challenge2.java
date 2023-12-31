package session07.challenges;

import java.time.LocalDate;

public class Challenge2 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        displayDateComponents(date);
    }

    public static void displayDateComponents(LocalDate date) {
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Day: " + date.getDayOfMonth());
    }
}
