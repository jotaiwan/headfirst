package chapter14;

import java.io.Serializable;

/**
 * Created by jotaiwan on 10/04/2017.
 */
public class StudentInfoTransient implements Serializable {

    String name;
    transient int rid;
    static String contact;

    StudentInfoTransient(String n, int r, String c)
    {
        this.name = n;
        this.rid = r;
        this.contact = c;
    }

}
