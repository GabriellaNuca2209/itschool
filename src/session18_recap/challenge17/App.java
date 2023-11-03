package session18_recap.challenge17;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("ALice", 20, "Metropolis"),
                new Person("Bob", 18, "Belarus"),
                new Person("Marco", 25, "Berlin"),
                new Person("Polo", 27, "Moscow"),
                new Person("Lisa", 16, "Antananarivo")
        ));

        List<String> names = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> !person.getCity().equals("Metropolis"))
                .map(Person::getName)
                .toList();

        System.out.println("People with age at least 18 and not from Metropolis: " + names);
    }
}
