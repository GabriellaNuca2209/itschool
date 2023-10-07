package session07.challenges;

import java.time.LocalDate;

public class Challenge5 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(isTodaySpecificDate(date));
    }

    public static boolean isTodaySpecificDate(LocalDate date) {
        LocalDate specificDate = LocalDate.of(2019, 12, 10);

        if (date.compareTo(specificDate) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
