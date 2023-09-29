package session9.practice.bookManagementSystem;

public class BookManagementSystem {

    public static void main(String[] args) {
        Author alice = new Author("Alice");
        Book book = new Book("Alice in wonderland", alice);

        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book author: " + book.getAuthorName());
    }
}
