package session07.challenges.EventSchedulerAndReminder;

import java.time.LocalDateTime;

public class Event {

    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public int timeUntilEvent(LocalDateTime eventDateTime) { // don't forget to work on this
        LocalDateTime today = LocalDateTime.now();
        return eventDateTime.getDayOfYear() - today.getDayOfYear();
    }

    public int timeUntilReminder(LocalDateTime reminderDateTime) { // don't forget to work on this as well, honey
        LocalDateTime today = LocalDateTime.now();
        return reminderDateTime.getDayOfYear() - today.getDayOfYear();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }
}
