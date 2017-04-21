package chapter15;

/**
 * Created by jotaiwan on 16/04/2017.
 */
public class My05ThreadImplRunnable implements Runnable {
    public void run() { // implements Runnable run()
        System.out.println("Here is the starting point of Thread.");
        for (int i = 0; i < 10; i++) { // infinite loop to print message
            System.out.println("User Created Thread");
        }
    }
    public static void main(String[] argv) {
        Thread t = new Thread(new My05ThreadImplRunnable()); // create Thread Object
        t.start(); // execute Runnable.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main Thread");
        }
    }
}
