package chapter16;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class Book565 implements Comparable<Book565> {
    private String title;

    public int compareTo(Book565 b) {
        return title.compareTo(b.getTitle());
    }

    public Book565(String t) {
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
