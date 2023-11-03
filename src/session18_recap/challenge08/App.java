package session18_recap.challenge08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Event> events = new ArrayList<>(List.of(
                new Event("Halloween Party", LocalDate.of(2023, 10, 31), "Some awesome description"),
                new Event("Christmas Party", LocalDate.of(2023, 12, 25), "Some awesome description"),
                new Event("Other Party", LocalDate.of(2023, 11, 6), "Some awesome description")
        ));

        addNewEvent(new Event("Happy Event", LocalDate.of(2023, 9, 25), "Description"), events);
        System.out.println(events);

        System.out.println("----------------");
        printEventsInOrder(events);
    }

    private static void addNewEvent(Event newEvent, List<Event> eventList) {
        eventList.add(newEvent);
    }

    private static void printEventsInOrder(List<Event> eventList) {
        eventList.stream()
                .sorted((event1, event2) -> event1.getEventDate().compareTo(event2.getEventDate()))
                .forEach(System.out::println);
    }
}
