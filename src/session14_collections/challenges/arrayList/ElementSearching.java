package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ElementSearching {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("green");
        myList.add("blue");

        searchElement(myList, "green");
    }

    private static void searchElement(List<String> list, String input) {
        if (list.contains(input)) {
            System.out.println("We have it");
        } else {
            System.out.println("Oh, no");
        }
    }
}
