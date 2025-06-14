interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book returned successfully.");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949, true);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());

        book.borrow();
        System.out.println("Available after borrowing: " + book.isAvailable());

        book.borrow(); // try to borrow again

        book.returnBook();
        System.out.println("Available after returning: " + book.isAvailable());
    }
}

