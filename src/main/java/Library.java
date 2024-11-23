import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    Library() {
        for (int i = 0; i < 5; i++) {
            books.add(new Book());
        }
    }

    Library(ArrayList<Book> books) {
        this.books = books;
    }

    Library(Library otherLibrary) {
        this.books = otherLibrary.books;
    }

    public ArrayList<Book> searchBooks(String keyword) {
        ArrayList<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            boolean titleContainsKeyword = book.getTitle().toLowerCase().contains(keyword.toLowerCase());
            boolean authorContainsKeyword = book.getAuthor().toLowerCase().contains(keyword.toLowerCase());

            if (titleContainsKeyword || authorContainsKeyword) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public boolean equals(Library otherLibrary) {
        if (books.size() != otherLibrary.books.size()) {
            return false;
        }

        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).equals(otherLibrary.books.get(i))) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        String string = "Books in Library:\n";

        for (Book book : books) {
            string += book.toString() + "\n";
        }

        return string;
    }

    public ArrayList<Book> getBooks() { return books; }
    public void setBooks(ArrayList<Book> books) { this.books = books; }
}
