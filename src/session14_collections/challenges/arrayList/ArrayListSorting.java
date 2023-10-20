package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorting {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 9, 4, 2, 45, 23, 10));
        list.sort((a, b) -> a - b);
//        Collections.sort(list);
        System.out.println(list);
    }
}
