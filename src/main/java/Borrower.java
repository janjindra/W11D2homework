import java.util.ArrayList;

public class Borrower {

    //Declaration
    private ArrayList<Book> borrowersCollection;


    //Constructor
    public Borrower() {
        this.borrowersCollection = new ArrayList<Book>();
    }

    //Methods
    public void addBookFromLibraryToBorrowersCollection(Library library){
        Book book = library.removeBook(book);
        this.borrowersCollection.add(book);
    }

    public int countBorrowersCollection(){
        return this.borrowersCollection.size();
    }
}




