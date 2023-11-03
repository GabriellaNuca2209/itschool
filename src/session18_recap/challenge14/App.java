package session18_recap.challenge14;

public class App {

    public static void main(String[] args) {
        Movie hungerGames = new Movie("The Hunger Games", "Dystopian");

        addRating(hungerGames, 5);
        addRating(hungerGames, 3);
        addRating(hungerGames, 4);
        addRating(hungerGames, 5);

        addRating(hungerGames, 7);
        addRating(hungerGames, -1);

        System.out.println(hungerGames.getRatings());

        printAverageRating(hungerGames);
    }

    private static void addRating(Movie movie, int rating) {
        if (rating >= 1 && rating <= 5) {
            movie.getRatings().add(rating);
        } else {
            System.out.println("Rating out of bounds. Please rate from 1 to 5");
        }
    }

    private static void printAverageRating(Movie movie) {
        double average = movie.getRatings().stream()
                .mapToDouble(a -> a)
                .average()
                .orElse(0.0);

        System.out.println("Average rating for " + movie.getTitle() + " is: " + average);
    }
}
