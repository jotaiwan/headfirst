package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class SuperChinese extends SuperPerson {
    SuperChinese() {
        super();
        prt("A Chinese.");
    }

    SuperChinese(String name) {
        super(name);
        prt("his name is " + name);
    }

    SuperChinese(String name, int age) {
        this(name);
        prt("his age is " + age);
    }
}
