package session7.challenges;

import java.time.LocalDate;

public class Challenge8 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        findDayOfWeek(date);
    }

    public static void findDayOfWeek(LocalDate date) {
        System.out.println(date.getDayOfWeek());
    }
}
