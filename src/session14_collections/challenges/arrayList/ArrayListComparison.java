package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListComparison {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> secondList = new ArrayList<>(List.of(1, 2, 3, 4, 6, 5));

        System.out.println(areEqual(firstList, secondList));
    }

    private static boolean areEqual(List<Integer> firstList, List<Integer> secondList) {
        return firstList.equals(secondList);
    }
}
