package session18_recap.challenge13;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String sentence = "KYC analysts have the responsibility to make risk controls";

        List<String> stringList = filterAndUppercase(sentence);
        System.out.println(stringList);
    }

    private static List<String> filterAndUppercase(String input) {
        List<String> result = Arrays.stream(input.split(" "))
                .filter(str -> str.length() >= 4)
                .map(String::toUpperCase)
                .toList();

        return result;
    }
}
