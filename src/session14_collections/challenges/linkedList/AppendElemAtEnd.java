package session14_collections.challenges.linkedList;

import java.util.LinkedList;
import java.util.List;

public class AppendElemAtEnd {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        list.addLast(6);
        list.addFirst(7);
        System.out.println(list);
    }
}
