package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPortion {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> newList = arrayList.subList(1, 4);
        System.out.println(newList);
    }
}
