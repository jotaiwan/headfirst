package chapter16;

import java.util.Comparator;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class BookCompare566Asc implements Comparator<Book566> {
    public int compare(Book566 b1, Book566 b2) {
        if (b1.getTitle().compareTo(b2.getTitle()) > 0) {
            return 1;
        }

        if (b2.getTitle().compareTo(b1.getTitle()) > 0) {
            return -1;
        }

        return 0;
    }
}
