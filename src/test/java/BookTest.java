import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("Andy Griffiths", "The 13-Storey Treehouse", "Children's fiction");
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Andy Griffiths", book1.getAuthor());
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The 13-Storey Treehouse", book1.getTitle());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Children's fiction", book1.getGenre());
    }
}
