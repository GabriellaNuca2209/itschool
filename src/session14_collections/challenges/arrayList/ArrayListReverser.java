package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverser {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("apple", "banana", "orange", "pear"));
        Collections.reverse(fruits);
        System.out.println(fruits);
    }
}
