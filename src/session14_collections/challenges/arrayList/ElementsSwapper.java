package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementsSwapper {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.swap(list, 0, 3);
        System.out.println(list);
    }
}
