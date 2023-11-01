package session18_recap.challenge10;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private List<Entry> entries;

    Diary() {
        entries = new ArrayList<>();
    }

    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "entries=" + entries +
                '}';
    }
}
