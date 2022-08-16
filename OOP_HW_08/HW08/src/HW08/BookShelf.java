package HW08;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {

    List<Book> bookshelf;
    int numberOfBook;
    int index = 0;

    public BookShelf() {
        bookshelf = new ArrayList<Book>();
    };

    public BookShelf(int num) {
        bookshelf = new ArrayList<Book>(num);
        this.numberOfBook = num;
    }

    public void appendBook(Book book) {
        bookshelf.add(book);
        this.index++;
        if (index > numberOfBook)
            numberOfBook = index;
    }

    public Iterator iterator() {
        return new BookShelfIterator(bookshelf);
    }

    public ReverseIterator reverseIterator() {
        return new BookShelfReverseIterator(bookshelf);
    }
}
