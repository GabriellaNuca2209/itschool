package session7.challenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date in the format: YYYY-MM-DD");
        String input = scanner.next();

        System.out.println(isValidDate(input));
    }

    public static boolean isValidDate(String inputDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(inputDate);
            System.out.println(inputDate + " is valid");
            return true;
        } catch (ParseException e) {
            System.out.println(inputDate + " is not valid");
            return false;
        }
    }
}
