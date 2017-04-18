package chapter15;

/**
 * Created by jotaiwan on 15/04/2017.
 */
public class My498Thread {
    public static void main(String[] args) {
        Runnable threadJob = new My498Runnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();
        System.out.println("Back to main");
    }
}
