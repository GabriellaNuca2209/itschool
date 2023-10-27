package session16_lambda_expressions.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge03 {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(List.of(3, 5, 9, 12));
        int result = numList.stream().reduce(0, (acc, val) -> acc + val);
        System.out.println(result);
    }
}
