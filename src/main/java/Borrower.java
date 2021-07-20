import java.awt.print.Book;
import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowersCollection;

    public Borrower (){
        this.borrowersCollection = new ArrayList<>();
    }

    public int getBorrowerLength() {
        return this.borrowersCollection.size();
    }

    public void addBookToCollectionFromLibrary(Library library) {
        Book book = library.removeBook();
        this.borrowersCollection.add(book);
    }
}
