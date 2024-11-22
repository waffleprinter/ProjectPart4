public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    Book() {
        title = "";
        author = "";
        price = 0.0;
        publisher = "";
        isbn = "";
    }

    Book(String title) {
        this.title = title;
        author = "";
        price = 0.0;
        publisher = "";
        isbn = "";
    }

    Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.publisher = book.publisher;
        this.isbn = book.isbn;
    }

    public void checkIsbnStatus() {

    }

    public void toTitleCase() {

    }

    public String toString() {
        String template =
                """
                %-10s: %s%n
                %-10s: %s%n
                %-10s: %d%n
                %-10s: %s%n
                %-10s: %s%n
                """;

        return String.format(template,
                "Title", title,
                "Author", author,
                "Price", price,
                "Publisher", publisher,
                "ISBN", isbn);
    }

    public boolean equals(Book book) {
        return (title.equals(book.title)         &&
                author.equals(book.author)       &&
                price == book.price              &&
                publisher.equals(book.publisher) &&
                isbn.equals(book.isbn)
        );
    }

    public void clone(Book book) {
        title = book.title;
        author = book.author;
        price = book.price;
        publisher = book.publisher;
        isbn = book.isbn;
    }

    // GETTERS AND SETTERS
}
