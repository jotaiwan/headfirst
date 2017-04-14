package chapter14;

import java.io.Serializable;

/**
 * Created by jotaiwan on 10/04/2017.
 */
public class StudentInfo implements Serializable {

    String name;
    int rid;
    static String contact;

    StudentInfo(String n, int r, String c)
    {
        this.name = n;
        this.rid = r;
        this.contact = c;
    }

}
