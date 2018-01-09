import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Library library2;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Book book7;
    private Book book8;

    @Before
    public void before(){
        library = new Library("Ellon Library",1);
        library2 = new Library("Ellon Library",100);
        book1 = new Book("Andy Griffiths", "The 13-Storey Treehouse", "Children's fiction");
        book2 = new Book("Andy Griftiths", "The 26-Storey Treehouse", "Children's fiction");
        book3 = new Book("Andy Griftiths", "The 39-Storey Treehouse", "Children's fiction");
        book4 = new Book("Neil Gaiman", "Neverwhere", "Fantasy");
        book5 = new Book("Neil Gaiman", "Stardust", "Fantasy");
        book6 = new Book("Tom Holt", "Open Sesame", "Comedy fiction");
        book7 = new Book("Tom Holt", "Odds and Gods", "Comedy fiction");
        book8 = new Book("Steven King", "IT", "Horror");

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

    @Test
    public void isGenreCountHashMapCorrect(){
        library2.addBook(book1);
        library2.addBook(book2);
        library2.addBook(book3);
        library2.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);
        library2.addBook(book7);
        library2.addBook(book8);
        HashMap<String, Integer> expectedHashMap = new HashMap<>();
        expectedHashMap.put("Children's fiction", 3);
        expectedHashMap.put("Fantasy", 2);
        expectedHashMap.put("Comedy fiction", 2);
        expectedHashMap.put("Horror", 1);
        assertEquals(expectedHashMap, library2.generateGenreCountHashMap());

    }

}
