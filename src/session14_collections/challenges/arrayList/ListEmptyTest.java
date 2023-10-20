package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListEmptyTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("banana", "mango"));

        if (list.isEmpty()) {
            System.out.println("empty soul");
        } else {
            System.out.println("we can eat, yay");
        }
    }
}
