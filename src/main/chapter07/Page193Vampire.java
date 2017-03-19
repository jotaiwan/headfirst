package chapter07;

/**
 * Created by jotaiwan on 18/03/2017.
 */
public class Page193Vampire extends Page193Monster {
    boolean scare(int x) {
        System.out.println("a bite?");
        return true;        // for 3
    }

    boolean frighten(byte b) {       // for 4
        System.out.println("a bite?");
        return true;
    }
}
