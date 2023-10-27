package session16_lambda_expressions.challenges.challenge09;

import java.util.List;

@FunctionalInterface
public interface OddListReturner {

    List<Integer> getOddNumbers(List<Integer> list);
}
