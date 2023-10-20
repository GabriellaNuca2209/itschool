package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReunion {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(6, 7, 8, 9, 10));
        list1.addAll(list2);
        System.out.println(list1);
    }
}
