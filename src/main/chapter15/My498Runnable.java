package chapter15;

/**
 * Created by jotaiwan on 15/04/2017.
 */
public class My498Runnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}
