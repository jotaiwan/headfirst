package chapter16;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class Book5651 implements Comparable {
    private String title;

    public int compareTo(Object o) {
        Book5651 book = (Book5651) o;
        return title.compareTo(book.getTitle());
    }

    public Book5651(String t) {
        setTitle(t);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}
