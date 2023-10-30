package session17_streams.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge03 {

    public static void main(String[] args) {
        List<Integer> numbers = generate100Numbers();

        List<Integer> primeNumbers = numbers.stream()
                        .filter(Challenge03::isPrime)
                                .toList();

        System.out.println(primeNumbers);
    }

    private static boolean isPrime(int num) {
        for (int div = 2; div <= num / 2; div++) {
            if (num % div == 0) return false;
        }
        return true;
    }

    private static List<Integer> generate100Numbers() {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index <= 100; index++) {
            list.add(index);
        }
        return list;
    }
}
