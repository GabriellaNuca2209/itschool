package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ElementUpdator {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("green");
        myList.add("blue");

        myList.set(1, "yellow");
        System.out.println(myList);
    }
}
