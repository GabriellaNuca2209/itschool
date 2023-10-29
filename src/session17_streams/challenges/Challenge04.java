package session17_streams.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge04 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four"));

        String oneString = strings.stream()
                .reduce((acc, val) -> acc + ", " + val)
                .get();

        System.out.println(oneString);
    }
}
