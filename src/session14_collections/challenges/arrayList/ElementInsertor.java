package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ElementInsertor {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("green");
        myList.add("blue");

        myList.add(0, "white");
        System.out.println(myList);
    }
}
