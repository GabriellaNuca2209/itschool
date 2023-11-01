package session18_recap.challenge14;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private String genre;
    private List<Integer> ratings;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        ratings = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
