package session16_lambda_expressions.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge02 {

    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>(List.of("Banana","Watermelon", "Cherry", "Apple"));
        fruitList.sort((a, b) -> a.compareTo(b));
        System.out.println(fruitList);
    }
}
