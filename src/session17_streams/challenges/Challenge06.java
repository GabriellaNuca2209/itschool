package session17_streams.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge06 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        int sum = numbers.stream()
                .reduce(0, (acc, val) -> acc + val);

        System.out.println(sum);
    }
}
