package session7.challenges;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challenge11 {

    public static void main(String[] args) {
        elapsedTimeSince("00:05:09");
    }

    public static void elapsedTimeSince(String inputPriorTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime convertedPriorTime = LocalTime.parse(inputPriorTime, formatter);
        LocalTime currentTime = LocalTime.now();
        Duration difference = Duration.between(convertedPriorTime, currentTime);

        long timeInSec = difference.toSeconds();
        int hours = (int) timeInSec / 3600;
        int minutes = (int) (timeInSec % 3600) / 60;
        int seconds = (int) timeInSec % 60;

        System.out.println("Elapsed time: " + twoDigitNum(hours) + ":" + twoDigitNum(minutes) + ":" + twoDigitNum(seconds));
    }

    public static String twoDigitNum(int number) {
        if (number == 0) {
            return "00";
        } else if (number / 10 == 0) {
            return "0" + number;
        }
        return String.valueOf(number);
    }
}
