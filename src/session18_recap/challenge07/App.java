package session18_recap.challenge07;

import java.util.List;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers(100, 200);

        List<Integer> primeNumbers = numbers.stream()
                .filter(App::isPrime)
                .limit(10)
                .toList();

        System.out.println(primeNumbers);
    }

    private static boolean isPrime(int n) {
        for (int index = 2; index < n; index++) {
            if (n % index == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> generateNumbers(int start, int end) {
        return IntStream.range(start, end)
                .boxed()
                .toList();
    }
}
