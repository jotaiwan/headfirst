package chapter06;

/**
 * Created by jotaiwan on 14/03/2017.
 */
public class ShortCircuit {
    // poage151

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a | b : " + (a | b));
        System.out.println("a || b : " + (a || b));
        System.out.println("a & b : " + (a & b));
        System.out.println("a && b : " + (a && b));


        boolean c = true;
        boolean d = false;

        System.out.println("c | d : " + (c | d));
        System.out.println("c || d : " + (c || d));
        System.out.println("c & d : " + (c & d));
        System.out.println("c && d : " + (c && d));
    }

}
