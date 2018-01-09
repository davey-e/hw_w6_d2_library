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

    public void removeBook(Book book) {
        this.books.remove(book);
    }
}
