package chapter07;

/**
 * Created by jotaiwan on 18/03/2017.
 */
public class Page193MonsterTestDrive {
    public static void main(String[] args) {
        Page193Monster [] ma = new Page193Monster[3];
        ma[0] = new Page193Vampire();
        ma[1] = new Page193Dragon();
        ma[2] = new Page193Monster();

        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }

}
