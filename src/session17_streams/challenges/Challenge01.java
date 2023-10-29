package session17_streams.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge01 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 4, 7, 8, 12, 15));

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println(evenNumbers);
    }
}
