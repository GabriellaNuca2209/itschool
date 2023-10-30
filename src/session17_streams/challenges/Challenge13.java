package session17_streams.challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge13 {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        int sum = numbers.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
