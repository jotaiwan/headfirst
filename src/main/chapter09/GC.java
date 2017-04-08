package chapter09;

/**
 * Created by jotaiwan on 2/04/2017.
 */
public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
//        System.out.println("gc1 hashcode : " + gc1);
        GC gc2 = new GC();
        print("gc2", gc2);
        GC gc3 = new GC();
        print("gc3", gc3);

        GC gc4 = gc3;
        print("gc4", gc4);

        gc1 = doStuff();
        print("gc1", gc1);

        gc4 = null;
        print("gc4", gc4);
        print("gc3", gc3);

        gc3 = gc2;
        print("gc3", gc3);
        System.out.println("gc3 hashcode : " + gc3);
    }

    public static void doStuff2(GC copyGC) {
        GC localGc = copyGC;
    }

    public static void print(String name, GC gc) {
        System.out.println(name + ": " + gc);
    }

}
