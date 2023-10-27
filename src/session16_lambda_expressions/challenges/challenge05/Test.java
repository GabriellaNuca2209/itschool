package session16_lambda_expressions.challenges.challenge05;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        MaxVal maxVal = numbers -> executeMaxVal(numbers);
        List<Integer> numbers = new ArrayList<>(List.of(1, 4, 7, 9));
        System.out.println("Max val: " + executeMaxVal(numbers));
    }

    public static int executeMaxVal(List<Integer> numbers) {
        if (!numbers.isEmpty()) {
            return numbers.stream().max((a, b) -> a.compareTo(b)).get();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
