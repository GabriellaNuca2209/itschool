package session16_lambda_expressions.challenges.challenge08;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface FunctionToElement {

    List<Integer> applyFunction(List<Integer> list, Function<Integer, Integer> function);
}
