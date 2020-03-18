import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryBooks;
    int capacity;

    public Library(int capacity) {
        this.libraryBooks = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public void addBookToLibrary(Book book) {
        if (this.isThereCapacityLeft()) {
            this.libraryBooks.add(book);
        }
    }

    public int bookCount() {
        return this.libraryBooks.size();
    }

    public void removeBook(Book book) {
        this.libraryBooks.remove(book);
    }

    public boolean isThereCapacityLeft() {
        if (this.libraryBooks.size() < this.capacity) {
            return true;
        } else {
            return false;
    }
}



}

