package chapter16;

import java.util.Comparator;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class BookCompare566 implements Comparator<Book566> {
    public int compare(Book566 b1, Book566 b2) {
        return (b1.getTitle().compareTo(b2.getTitle()));
    }
}
