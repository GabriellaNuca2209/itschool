package session18_recap.challenge12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("apple", "watermelon", "banana", "pineapple", "pear"));

        List<String> result = getFilteredReversedUppercasedList(fruits);

        System.out.println(result);
    }

    private static List<String> getFilteredReversedUppercasedList(List<String> list) {
        List<String> result = new ArrayList<>(list.stream()
                .filter(str -> str.length() < 7)
                .map(String::toUpperCase)
                .toList());
        Collections.reverse(result);
        return result;
    }
}
