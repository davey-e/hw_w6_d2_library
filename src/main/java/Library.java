import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public boolean isLibraryFull(){
        if(getBookCount() < this.capacity) {
            return false;
        } else {
            return true;
        }
    }

    public void addBook(Book book) {
        if (!isLibraryFull()) {
            this.books.add(book);
        }
    }

    public Book removeBook(Book book) {
        int bookIndex = this.books.indexOf(book);
        return this.books.remove(bookIndex);
//        why doesn't this work?:
//        return this.books.remove(book);
//        When i tried this it complained about incompatible types. Required: Book, Found: Boolean
    }
}
