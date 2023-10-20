package session14_collections.challenges.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIterator {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("green");
        myList.add("blue");

        printArrayElements(myList);
    }

    private static void printArrayElements(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }
}
