package session16_lambda_expressions.challenges.challenge08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Function<Integer, Integer> multiplyInt = a -> a * 2;

        FunctionToElement elemFunc = (list, function) -> getNewList(list, function);
        System.out.println(elemFunc.applyFunction(numList, multiplyInt));
    }

    public static List<Integer> getNewList(List<Integer> list, Function<Integer, Integer> function) {
        List<Integer> newList = new ArrayList<>();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Invalid list");
        }
        list.forEach(num -> newList.add(function.apply(num)));
        return newList;
    }
}
