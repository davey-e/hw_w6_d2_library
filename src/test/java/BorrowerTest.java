import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library("Ellon Library", 1);
        book = new Book("Andy Griffiths", "The 13-Storey Treehouse");
        borrower = new Borrower("Michael Davidson", 6);
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Michael Davidson", borrower.getName());
    }

    @Test
    public void borrowerHasAge(){
        assertEquals(6, borrower.getAge());
    }

    @Test
    public void borrowerBooksStartsEmpty(){
        assertEquals(0, borrower.getBookCount());
    }
}
