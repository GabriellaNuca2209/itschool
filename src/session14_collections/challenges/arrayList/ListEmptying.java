package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListEmptying {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("ham ham", "meow", "dfsdg"));
        list.clear();
        System.out.println(list);
    }
}
