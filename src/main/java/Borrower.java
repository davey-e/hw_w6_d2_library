import java.util.ArrayList;

public class Borrower {

    String name;
    int age;
    ArrayList<Book> books;

    public Borrower(String name, int age){
        this.name = name;
        this.age = age;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBookCount() {
        return this.books.size();
    }
}
