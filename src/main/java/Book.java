/**
 @author Jacques-Conrad Calagui-Painchaud 6298805
 This class contains information about a book, along with a variety of methods.
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn; // Either 13 or 17 characters long

    /**
     Default constructor
     Creates a blank book with no information.
     */
    Book() { }

    /**
     Constructor
     @param title Title of the book.
     Creates a blank book with no information other than a user-given title.
     */
    Book(String title) {
        this.title = title;
    }

    /**
     Constructor
     @param title Title of the book.
     @param author Author of the book.
     @param price Price of the book.
     @param publisher Publisher of the book.
     @param isbn ID of the book. Should be 13 or 17 characters long.
     Creates a book with information provided by the user.
     */
    Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    /**
     Copy constructor
     @param otherBook Another Book object.
     Creates a new book with identical information to the other book.
     */
    Book(Book otherBook) {
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
        this.publisher = otherBook.publisher;
        this.isbn = otherBook.isbn;
    }

    /**
     The checkIsbnStatus method
     @return 0 if the length is 13, 1 if the length is 17, -1 if the length is anything else (incorrect).
     Checks if the length of the ISBN is of correct length (must be 13 or 17).
     */
    public int checkIsbnStatus() {
        return switch (isbn.length()) {
            case 13 -> 0;
            case 17 -> 1;
            default -> -1;
        };
    }

    /**
     The toTitleCase method
     Changes the title and author of the book to title case.
     */
    public void toTitleCase() {
        String[] titleWords = title.toLowerCase().split(" ");
        String[] authorWords = author.toLowerCase().split(" ");

        for (int i = 0; i < titleWords.length; i++) {
            titleWords[i] = titleWords[i].substring(0, 1).toUpperCase() + titleWords[i].substring(1);
        }

        for (int i = 0; i < authorWords.length; i++) {
            authorWords[i] = authorWords[i].substring(0, 1).toUpperCase() + authorWords[i].substring(1);
        }
    }

    /**
     The toString method
     @return Information about the book.
     */
    public String toString() {
        String template =
                """
                %-10s: %s
                %-10s: %s
                %-10s: %f
                %-10s: %s
                %-10s: %s
                """;

        return String.format(template,
                "Title", title,
                "Author", author,
                "Price", price,
                "Publisher", publisher,
                "ISBN", isbn);
    }

    /**
     The equals method
     @param otherBook another Book object.
     @return whether the other book contains identical information.
     */
    public boolean equals(Book otherBook) {
        return (title.equals(otherBook.title)         &&
                author.equals(otherBook.author)       &&
                price == otherBook.price              &&
                publisher.equals(otherBook.publisher) &&
                isbn.equals(otherBook.isbn)
        );
    }

    public void clone(Book otherBook) {

    }

    // Simple getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public String getPublisher() { return publisher; }
    public String getIsbn() { return isbn; }

    // Simple setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
