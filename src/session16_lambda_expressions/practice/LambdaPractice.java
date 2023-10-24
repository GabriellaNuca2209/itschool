package session16_lambda_expressions.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        IntMultiply getMultiplication = (a, b) -> a * b;

        System.out.println("Sum: " + getSum.sum(10, 25));
        System.out.println("Multiply: " + getMultiplication.multiply(20, 5));

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // print names elements using lambda expression
        names.forEach(name -> System.out.println(name));

        // print names elements with for
        for (String name : names) {
            System.out.println(name);
        }
    }
}
