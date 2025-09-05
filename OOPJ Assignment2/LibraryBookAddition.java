class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
class Library {
    private String libraryName;
    private static int totalBooks = 0;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }
    public void addBook(Book b) {
        totalBooks++;
        System.out.println("Book Added: " + b.getTitle() + " by " + b.getAuthor());
    }

    public void displayTotalBooks() {
        System.out.println("Total Books in " + libraryName + ": " + totalBooks);
    }
}
public class LibraryBookAddition {
    public static void main(String[] args) {
    
        Library lib = new Library("CDAC Library");

        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Data Structures", "Robert Lafore");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}
