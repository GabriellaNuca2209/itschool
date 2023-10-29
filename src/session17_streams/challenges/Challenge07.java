package session17_streams.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge07 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Hello", "World", "Java", "Streams"));

        List<Integer> stringLengths = strings.stream()
                .map(str -> str.length())
                .toList();

        System.out.println(stringLengths);
    }
}
