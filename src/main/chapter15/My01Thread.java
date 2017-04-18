package chapter15;

/**
 * Created by jotaiwan on 14/04/2017.
 */
public class My01Thread extends Thread {

    public My01Thread(String name) {
        super(name) ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(this.getName()+" : "+i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new My01Thread("Thread : Chang3") ;
        Thread t2 = new My01Thread("Thread : Lee4") ;

        t1.start();
        t2.start();
    }

}
