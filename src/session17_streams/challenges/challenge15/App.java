package session17_streams.challenges.challenge15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(List.of(
                new Book("Harry Potter", "J. K. Rowling", 1998),
                new Book("The Great Gatsby", "F. Skott Fitzgerald", 1925),
                new Book("Pet Sematary", "Stephen King", 1983),
                new Book("The Hunger Games", "Suzanne Collins", 2008),
                new Book("Carrie", "Stephen King", 1970)
        ));

        Map<String, List<Book>> authorWithBooks = bookList.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .collect(Collectors.toMap(
                        Book::getAuthor,
                        book -> {
                            List<Book> list = new ArrayList<>();
                            list.add(book);
                            return list;
                        },
                        (acc, val) -> {
                            System.out.println(acc);
                            System.out.println(val);
                            acc.add(val.get(0));
                            return acc;
                        }));

        System.out.println(authorWithBooks);
    }
}
