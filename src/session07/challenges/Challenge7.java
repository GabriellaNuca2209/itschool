package session07.challenges;

import java.time.LocalDate;

public class Challenge7 {

    public static void main(String[] args) {
        addWeeksToToday(3);
    }

    public static void addWeeksToToday(int numOfWeeks) {
        LocalDate today = LocalDate.now();
        LocalDate dateAfterNumWeeks = today.plusWeeks(numOfWeeks);
        System.out.println(dateAfterNumWeeks);
    }
}
