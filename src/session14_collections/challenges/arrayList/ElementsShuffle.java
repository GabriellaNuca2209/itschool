package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementsShuffle {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 4, 6, 8));
        Collections.shuffle(list);
        System.out.println(list);
    }
}
