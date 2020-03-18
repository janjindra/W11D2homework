import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book2;
    private Library library;

    //Before

    @Before
    public void before(){
        book = new Book("1984", "George Orwell", "fiction");
        book2 = new Book("Harry Potter", "J.K. Rowling", "fiction");
        library = new Library(2);
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book2);
        library.removeBook(book);
        assertEquals(1, library.bookCount());

    }

    @Test
    public void canBookCount(){
        library.addBookToLibrary(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void testIsThereCapacityLeftTrue(){
        library.addBookToLibrary(book);
        assertEquals(true, library.isThereCapacityLeft());
    }

    @Test
    public void testIsThereCapacityLeftFalse(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book2);
        assertEquals(false, library.isThereCapacityLeft());
    }

}
