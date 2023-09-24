package session7.challenges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first date in the format: YYYY-MM-DD");
        String firstDate = scanner.next();
        System.out.println("Please enter second date in the format: YYYY-MM-DD");
        String secondDate = scanner.next();
        System.out.println(areDatesEqual(firstDate, secondDate));
        scanner.close();
    }

    public static boolean areDatesEqual(String firstDate, String secondDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstDateConverted = LocalDate.parse(firstDate, formatter);
        LocalDate secondDateConverted = LocalDate.parse(secondDate, formatter);

        if (firstDateConverted.compareTo(secondDateConverted) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
