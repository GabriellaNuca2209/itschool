package session16_lambda_expressions.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge01 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        integerList.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.println(num));
    }

}
