package chapter07;

/**
 * Created by jotaiwan on 18/03/2017.
 */
public class Page194TestBoats {
    public static void main(String[] args) {
        Page194Boat b1 = new Page194Boat();
        Page194Sailboat b2 = new Page194Sailboat();
        Page194Rowboat b3 = new Page194Rowboat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
