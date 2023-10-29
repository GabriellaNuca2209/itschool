package session17_streams.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge05 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Alice", "Macarena", 23),
                new Person("Martin", "Mat", 17),
                new Person("Bob", "Marley", 32)));

        List<Person> olderThan18 = people.stream()
                .filter(person -> person.getAge() > 18)
                .toList();

        System.out.println(olderThan18);
    }
}
