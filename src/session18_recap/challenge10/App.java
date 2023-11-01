package session18_recap.challenge10;

import java.time.LocalDate;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Diary diary = new Diary();

        createAndAddEntryToList(diary, LocalDate.of(2023, 11, 1), "Some awesome experience of today");
        createAndAddEntryToList(diary, LocalDate.of(2023, 11, 4), "Another experience");
        createAndAddEntryToList(diary, LocalDate.of(2023, 10, 12), "Having fun");

        System.out.println(diary.getEntries());

        searchEntryByDate(LocalDate.of(2023, 10, 12), diary);
    }

    private static void createAndAddEntryToList(Diary diary, LocalDate date, String content) {
        diary.getEntries().add(new Entry(date, content));
    }

    private static void searchEntryByDate(LocalDate date, Diary diary) {
        List<Entry> list = diary.getEntries().stream()
                .filter(entry -> entry.getDate().equals(date))
                .toList();

        System.out.println(list);
    }
}
