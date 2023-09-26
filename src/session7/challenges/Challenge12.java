package session7.challenges;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date and time in this format: YYYY-MM-DD HH:MM:SS");
        String input = scanner.nextLine();

        // 2023-09-25 00:50:12

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZoneId newTimeZone = ZoneId.of("Europe/London");
        scanner.close();

        System.out.println(newTimeZone + ": " + changeTimeZone(newTimeZone, input, formatter));
    }

    private static String changeTimeZone(ZoneId newTimeZone, String input, DateTimeFormatter format) {
        LocalDateTime inputDate = LocalDateTime.parse(input, format);
        return convertTimeZone(inputDate, newTimeZone, format);
    }

    private static String convertTimeZone(LocalDateTime dateAndTimeInput, ZoneId newTimeZone, DateTimeFormatter format) {
        ZoneId localZoneId = ZoneId.systemDefault();
        ZonedDateTime localDateAndTime = dateAndTimeInput.atZone(localZoneId);
        System.out.println(localDateAndTime);
        ZonedDateTime updatedDateAndTime = localDateAndTime.withZoneSameInstant(newTimeZone);
        System.out.println(updatedDateAndTime);

        return updatedDateAndTime.format(format);
    }
}
