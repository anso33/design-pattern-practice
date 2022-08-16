package HW08;

import java.util.List;

public class BookShelfIterator implements Iterator{

    List<Book> bookshelf;
    int position = 0;

    public BookShelfIterator(List<Book> bookshelf) {
        this.bookshelf = bookshelf;
    }

    @Override
    public Object next() {
        Book book = bookshelf.get(position);
        position++;
        return (book);
    }

    @Override
    public boolean hasNext() {
        if (position >= bookshelf.size() || bookshelf.get(position) == null)
            return (false);
        else
            return (true);
    }
}
