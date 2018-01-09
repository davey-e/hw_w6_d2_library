import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library("Ellon Library", 1);
        book1 = new Book("Andy Griffiths", "The 13-Storey Treehoouse", "Children's fiction");
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

    @Test
    public void canBorrowBook(){
        library.addBook(book1);
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.getBookCount());

    }
}
