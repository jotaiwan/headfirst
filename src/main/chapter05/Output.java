package chapter05;

/**
 * Created by jotaiwan on 5/03/2017.
 */
public class Output {
    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " " );
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
