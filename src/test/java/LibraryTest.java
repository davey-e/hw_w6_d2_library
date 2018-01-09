import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library("Ellon Library",1);
        book1 = new Book("Andy Griffiths", "The 13-Storey Treehouse", "Children's fiction");
        book2 = new Book("Andy Griftiths", "The 26-Storey Treehouse", "Children's fiction");
    }

    @Test
    public void libraryHasName(){
        assertEquals("Ellon Library", library.getName());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(1, library.getCapacity());
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

    @Test
    public void wontAddBookWhenLibraryIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.getBookCount());
    }

}
