import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Book book2;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("1984", "George Orwell", "fiction");
        book2 = new Book("Harry Potter", "J.K. Rowling", "fiction");
        borrower = new Borrower();
    }


    @Test
    public void canAddBookFromLibraryToBorrowersCollection(){
        this.borrower.addBookFromLibraryToBorrowersCollection(library);
        assertEquals(1, borrower.countBorrowersCollection());
    }

//    public void addBookFromLibraryToBorrowersCollection(Library library){
//        Book book = library.removeBook();
//        this.borrowersCollection.add(book);
//
//
//
//        public void canShitInTheWoods(){
//            bear.eatFishFromRiver(river);
//            bear.sleep();
//            assertEquals(0, bear.foodCount());
//}

}