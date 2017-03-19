package chapter07;

/**
 * Created by jotaiwan on 18/03/2017.
 */
public class Page192Mix2 {
    public static void main(String[] args) {
        Page192A a = new Page192A();
        Page192B b = new Page192B();
        Page192C c = new Page192C();

        Page192A a2 = new Page192C();

        b.m1();
        c.m2();
        a.m3();
        System.out.println("************************");

        c.m1();
        c.m2();
        c.m3();
        System.out.println("************************");

        a.m1();
        b.m2();
        c.m3();
        System.out.println("************************");

        a2.m1();
        a2.m2();
        a2.m3();
        System.out.println("************************");
    }
}
