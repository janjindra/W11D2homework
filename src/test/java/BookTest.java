import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("1984", "George Orwell", "fiction");
    }

    @Test
    public void canGetTitle(){
        assertEquals("1984", book.title);
    }

    @Test
    public void canGetAuthor(){
        assertEquals("George Orwell", book.author);
    }

    @Test
    public void canGetGenre(){
        assertEquals("fiction", book.genre);
    }
}
