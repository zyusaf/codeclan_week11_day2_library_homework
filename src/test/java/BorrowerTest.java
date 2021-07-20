import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book();
        library = new Library();
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void borrowerCollectionStartsEmpty(){
        assertEquals(0, borrower.getBorrowerLength());
    }

    @Test
    public void canAddBookToCollectionFromLibrary(){
        borrower.addBookToCollectionFromLibrary(library);
        borrower.addBookToCollectionFromLibrary(library);
        borrower.addBookToCollectionFromLibrary(library);
        assertEquals(3, borrower.getBorrowerLength());
        assertEquals(1, library.getBookCollectionLength());
    }

}
