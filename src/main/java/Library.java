import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> booksCollection;

    public Library(){
        this.capacity = 4;
        this.booksCollection = new ArrayList<>();
    }

    public int getBookCollectionLength() {
        return this.booksCollection.size();
    }

    public void addBook(Book book) {
        if (this.booksCollection.size() < this.capacity) {
            this.booksCollection.add(book);
        }
    }

    public Book removeBook(){
        return this.booksCollection.remove(0);
    }
}
