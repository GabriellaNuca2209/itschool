package session07.challenges.EventSchedulerAndReminder;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        Event event = new Event("Go to Vet", "Vaccination",
                LocalDateTime.of(2023, 9, 29, 18, 30),
                LocalDateTime.of(2023, 9, 29, 9, 0));
        Scheduler scheduler = new Scheduler();
        scheduler.addEvent(event);

        System.out.println(event.timeUntilEvent(event.getEventDateTime()) + " days");
        System.out.println(event.getEventName());
        System.out.println(scheduler.events.size()); // before attempting to remove object
        scheduler.removeEvent(event.getEventName());
        System.out.println(scheduler.events.size()); // result after removing object
    }
}
