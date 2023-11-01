package session18_recap.challenge15;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int product = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce((a, b) -> a * b)
                .get();

        System.out.println(product);
    }
}
