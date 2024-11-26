import java.util.ArrayList;

/**
 @author Jacques-Conrad Calagui-Painchaud 6298805
 This class defines a library with a list of books.
 */
public class Library {
    ArrayList<Book> books = new ArrayList<>();

    /**
     Constructor
     Creates a library with 5 blank books.
     */
    Library() {
        for (int i = 0; i < 5; i++) {
            books.add(new Book());
        }
    }

    /**
     Constructor
     @param otherBooks arrayList of book objects.
     Creates a library with user-defined books.
     */
    Library(ArrayList<Book> otherBooks) {
        for (Book book : otherBooks) {
            this.books.add(new Book(book));
        }
    }

    /**
     Copy constructor
     Creates a library with identical members to another library.
     */
    Library(Library otherLibrary) {
        for (Book book : otherLibrary.books) {
            this.books.add(new Book(book));
        }
    }

    /**
     The searchBooks method
     @param keyword The word that you are searching for.
     @return List of books with the word that you are searching for.
     Searches the library for books with the keyword in the title or in the author name.
     */
    public ArrayList<Book> searchBooks(String keyword) {
        ArrayList<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            boolean titleContainsKeyword = book.getTitle().toLowerCase().contains(keyword.toLowerCase());
            boolean authorContainsKeyword = book.getAuthor().toLowerCase().contains(keyword.toLowerCase());

            if (titleContainsKeyword || authorContainsKeyword) {
                filteredBooks.add(new Book(book));
            }
        }

        return filteredBooks;
    }

    /**
     The equals method
     @param otherLibrary another library object.
     @return Whether both libraries contain identical information.
     Checks if all the books in the other library are equal to this library's books.
     */
    public boolean equals(Library otherLibrary) {
        // Both libraries can't be equal if they don't contain the same amount of books.
        if (books.size() != otherLibrary.books.size()) {
            return false;
        }

        // Checks if all books in both libraries are equal.
        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).equals(otherLibrary.books.get(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     The toString method
     @return A string containing the information about every book.
     */
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
