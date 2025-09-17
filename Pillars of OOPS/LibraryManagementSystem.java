package PillarsOfOOPS;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public abstract int getLoanDuration();
    public String getItemDetails() { return itemId + ", " + title + ", " + author; }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() { return 21; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() { return 7; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() { return 14; }
    public void reserveItem() {}
    public boolean checkAvailability() { return true; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B1", "Java", "Author1");
        items[1] = new Magazine("M1", "Tech", "Author2");
        items[2] = new DVD("D1", "Movie", "Author3");
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + " Loan Duration: " + item.getLoanDuration());
        }
    }
}
