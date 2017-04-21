package chapter15;

/**
 * Created by jotaiwan on 15/04/2017.
 */
public class My503RunThreads implements Runnable {
    public static void main(String[] args) {
        My503RunThreads runner = new My503RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("alpha thread");
        beta.setName("beta thread");
        alpha.start();
        beta.start();
    }

    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running...");
        }
    }
}
