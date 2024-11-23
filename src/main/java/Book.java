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

    Book(Book otherBook) {
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
        this.publisher = otherBook.publisher;
        this.isbn = otherBook.isbn;
    }

    // THIS DOESN'T REALLY COVER IT
    public int checkIsbnStatus() {
        return switch (isbn.length()) {
            case 13 -> 0;
            case 17 -> 1;
            default -> -1;
        };
    }

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

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public String getPublisher() { return publisher; }
    public String getIsbn() { return isbn; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
