package session8.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("John");
        names.add("Patrick");

        names.add(1, "Frank");

        System.out.println(names);
        if (names.isEmpty()) {
            System.out.println("names list is empty");
        } else {
            System.out.println("names list is not empty;\nsize: " + names.size());
        }

        String firstElement = names.get(0);
        System.out.println("First element from names: " + firstElement);
    }
}
