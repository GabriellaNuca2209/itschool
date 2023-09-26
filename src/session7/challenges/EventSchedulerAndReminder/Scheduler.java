package session7.challenges.EventSchedulerAndReminder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Scheduler {

    public ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        events.add(e);
    }

    public void removeEvent(String eventName) {
        events.removeIf(event -> Objects.equals(event.getEventName(), eventName));
    }

    public void getUpcomingEvents(int n) { // return the next n upcoming events

    }

    public void getEventsOn(LocalDate date) { // returns all events scheduled for a specific date

    }

    public void getPendingReminders() { // returns all reminders that are due to notify the user soon (e.g: 24 h)

    }
}
