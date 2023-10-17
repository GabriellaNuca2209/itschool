package session14_collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);

        List<Integer> updatedList = getUpdatedList(myList, 1, 10);
        System.out.println(updatedList);

        List<Integer> evenNumbers = getEvenNumbersList(myList);
        System.out.println(evenNumbers);

        int maxVal = findMaximum(myList);
        System.out.println(maxVal);
    }

    public static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            list.add(index);
        }
        return list;
    }

    public static List<Integer> getUpdatedList(List<Integer> list, int index, int value) {
        if (index >= list.size() || index < 0) {
            System.out.println("Invalid index");
            return list;
        }

        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }

    public static List<Integer> getEvenNumbersList(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static int findMaximum(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }

        int result = list.get(0);
        for (int number : list) {
            if (result < number) {
                result = number;
            }
        }
        return result;
    }
}
