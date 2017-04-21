package chapter15;

/**
 * Created by jotaiwan on 15/04/2017.
 */
public class My03Thread {


    public void m4t1() {
        System.out.println("called m4t1");
        synchronized(this) {
            int i = 5;
            while( i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
    }
    public void m4t2() {
        System.out.println("called m4t2");
        synchronized(this) {
            int i = 5;
            while( i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                }
            }
        }
   }

    public synchronized void m4t3() {
        System.out.println("called m4t3");
        int i = 5;
        while( i-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
            }
        }
    }

    public static void main(String[] args) {
        final My03Thread myt2 = new My03Thread();
        Thread t1 = new Thread(
                new Runnable() {
                    public void run() {
                        myt2.m4t1();
                    }
                }, "t1"
        );
        Thread t2 = new Thread(
                new Runnable() {
                    public void run() {
                        myt2.m4t2();
                    }
                }, "t2"
        );
        Thread t3 = new Thread(
                new Runnable() {
                    public void run() {
                        myt2.m4t2();
                    }
                }, "t3"
        );
        t1.start();
        t2.start();
        t3.start();
    }
}




