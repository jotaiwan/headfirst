package chapter10;

/**
 * Created by jotaiwan on 1/04/2017.
 */
public class Foof283 {
    final int size = 3;
    final int whuffie;

    public Foof283() {
        whuffie = 3;
    }

    void doStuff(final int x) {
        System.out.println("x(p283) is : " + x);
        System.out.println("whuffie(p283) is : " + whuffie);
    }

    void doMore() {
        final int z = 7;
//        z = 0;        // error
    }
}
