package session07.challenges;

import java.time.LocalDate;

public class Challenge3 {

    public static void main(String[] args) {
        createSpecificDate(2025, 8, 19);
    }

    public static void createSpecificDate(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date);
    }
}
