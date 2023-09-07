package HW08_1.HW08;

import java.util.List;

public class BookShelfReverseIterator implements ReverseIterator{

    List<Book> bookshelf;
    int position = 0;

    public BookShelfReverseIterator(List<Book> bookshelf) {
        this.bookshelf = bookshelf;
        position = bookshelf.size();
        position--;
    }

    @Override
    public Object previous() {
        Book book = bookshelf.get(position);
        position--;
        return (book);
    }

    @Override
    public boolean hasPrevious() {
        if (position < 0 || bookshelf.get(position) == null)
            return (false);
        else
            return (true);
    }
}
