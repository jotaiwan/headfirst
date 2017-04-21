package chapter15;

/**
 * Created by jotaiwan on 14/04/2017.
 */
public class My01Runnable implements Runnable {

   private String name ;

    public My01Runnable(String name) {
        this.name = name ;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(name +" : "+i);
            }
        }
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new My01Runnable("Runnable: Chang3")) ;
        Thread t2 = new Thread(new My01Runnable("Runnabke Lee4")) ;
        t1.start();
        t2.start();
    }
}
