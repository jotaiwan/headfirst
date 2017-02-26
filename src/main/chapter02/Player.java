package chapter02;

/**
 * Created by jotaiwan on 26/02/2017.
 */
public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I am gussing " + number);
    }
}
