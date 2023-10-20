package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopy {

    public static void main(String[] args) {
        List<Integer> listOfInt = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> secondList = new ArrayList<>(listOfInt);
        System.out.println(secondList);
    }
}
