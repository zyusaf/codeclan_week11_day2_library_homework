import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void bookCollectionStartsEmpty(){
        assertEquals(0, library.getBookCollectionLength());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBook(book);
        assertEquals(1, library.getBookCollectionLength());
    }

    @Test
    public void cannotAddBookToCollectionIfStockFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.getBookCollectionLength());
    }

    @Test
    public void canRemoveBookFromCollection(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.getBookCollectionLength());
    }

}
