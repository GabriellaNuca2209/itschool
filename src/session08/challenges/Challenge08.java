package session08.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Challenge08 {

    public static void main(String[] args) {
        String[] movieTitles = {"Fast and Furious", "The Matrix", "Talk To Me", "Insidious"};
        checkMovieTitle("The Matrix", movieTitles);
    }

    public static void checkMovieTitle(String input, String[] movieArr) {
        ArrayList<String> moviesList = new ArrayList<>(Arrays.asList(movieArr));
        for (String movie : moviesList) {
            if (Objects.equals(movie, input)) {
                System.out.println("Index for " + input + " is: " + moviesList.indexOf(input));
                return;
            }
        }
        System.out.println("Not here");
    }
}
