package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListCloning {

    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>(List.of(1, 2, 3));
        ArrayList secondList;
        secondList = (ArrayList<Integer>) firstList.clone();
        System.out.println(secondList);
    }
}
