package ObjectRelationAndModelling;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();
    public Library(String name) {
        this.name = name;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> getBooks() { return books; }
    public String getName() { return name; }
}

public class LibraryAndBooksAggregation {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Author1");
        Book b2 = new Book("Python", "Author2");
        Library lib1 = new Library("Central");
        Library lib2 = new Library("Community");
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        for (Book b : lib1.getBooks()) {
            System.out.println(lib1.getName() + " has book: " + b.getTitle());
        }
        for (Book b : lib2.getBooks()) {
            System.out.println(lib2.getName() + " has book: " + b.getTitle());
        }
    }
}
