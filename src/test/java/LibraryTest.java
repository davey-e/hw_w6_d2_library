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
        book1 = new Book();
        book2 = new Book();
    }

    @Test
    public void libraryHasName(){
        assertEquals("Ellon Library", library.getName());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

}
