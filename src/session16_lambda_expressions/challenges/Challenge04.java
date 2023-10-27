package session16_lambda_expressions.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge04 {

    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>(List.of("Potato", "Carrot", "Radish", "Eggplant"));
        vegetables.sort((a, b) -> a.compareTo(b));
        System.out.println(vegetables);
        vegetables.sort((a, b) -> b.compareTo(a));
        System.out.println(vegetables);
    }
}
