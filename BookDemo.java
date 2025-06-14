// Base class
// class Book {
//     protected String title;
//     protected String author;

//     // Constructor
//     public Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }

//     // Method to display book details
//     public void displayDetails() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//     }
// }

// // FictionBook class inherits from Book
// class FictionBook extends Book {
//     public FictionBook(String title, String author) {
//         super(title, author);
//     }
// }
// class NonFictionBook extends Book {
//     public NonFictionBook(String title, String author) {
//         super(title, author);
//     }
// }
// class TechnicalBook extends Book {
//     public TechnicalBook(String title, String author) {
//         super(title, author);
//     }
// }

// // Main class
// public class BookDemo {
//     public static void main(String[] args) {
//         FictionBook fiction = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald");
//         NonFictionBook nonfiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
//         TechnicalBook technical = new TechnicalBook("Java Programming", "James Gosling");
//         System.out.println("Fiction Book:");
//         fiction.displayDetails();

//         System.out.println("\nNon-Fiction Book:");
//         nonfiction.displayDetails();

//         System.out.println("\nTechnical Book:");
//         technical.displayDetails();
//     }
// }
