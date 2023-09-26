package session7.challenges;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challenge6 {

    public static void main(String[] args) {
        displayCurrentTime();
    }

    public static void displayCurrentTime() {
        LocalTime dateTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }
}
