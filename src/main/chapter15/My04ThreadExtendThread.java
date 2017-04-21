package chapter15;

/**
 * Created by jotaiwan on 16/04/2017.
 */
public class My04ThreadExtendThread extends Thread {

    public void run() { // override Thread's run()
        System.out.println("Here is the starting point of Thread.");
        for (int i = 0; i < 50; i++) { // infinite loop to print message
            System.out.println("User Created Thread");
        }
    }
    public static void main(String[] argv) {
        Thread t = new My04ThreadExtendThread(); // create Thread Object
        t.start(); // execute t.run()
        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }
    }

}
