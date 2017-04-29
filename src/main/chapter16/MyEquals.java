package chapter16;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class MyEquals {
    public final int x;
    public final int y;

    public MyEquals(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(MyEquals that) {
        return this.x == that.x && this.y == that.y;
    }
}
