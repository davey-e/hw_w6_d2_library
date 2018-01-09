import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before(){
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
