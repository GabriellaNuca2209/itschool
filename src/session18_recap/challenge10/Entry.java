package session18_recap.challenge10;

import java.time.LocalDate;

public class Entry {

    private LocalDate date;
    private String content;

    public Entry(LocalDate date, String content) {
        this.date = date;
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
