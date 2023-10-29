package session17_streams.challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Challenge02 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("apple", "banana", "cherry", "date", "elderberry"));

        String longestString = strings.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(longestString);
    }
}
