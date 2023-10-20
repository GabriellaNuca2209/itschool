package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListSizeIncreaser {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        list.ensureCapacity(50);
    }
}
