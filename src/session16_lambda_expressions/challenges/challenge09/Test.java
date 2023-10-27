package session16_lambda_expressions.challenges.challenge09;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        OddListReturner oddListReturner = numbers -> getOddList(numbers);
        System.out.println(oddListReturner.getOddNumbers(integerList));
    }

    public static List<Integer> getOddList(List<Integer> numbers) {
        List<Integer> oddList = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) oddList.add(number);
        }
        return oddList;
    }
}
