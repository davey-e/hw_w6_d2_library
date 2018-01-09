import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library("Ellon Library");
        book1 = new Book("Andy Griffiths", "The 13-Storey Treehouse");
        book2 = new Book("Andy Griftiths", "The 26-Storey Treehouse");
    }

    @Test
    public void libraryHasName(){
        assertEquals("Ellon Library", library.getName());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

}
