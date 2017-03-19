package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class SuperPerson {


    public static void prt(String s) {
        System.out.println(s);
    }

    SuperPerson() {
        prt("A person.");
    }

    SuperPerson(String name) {
        prt("A person's name: " + name);
    }
}
