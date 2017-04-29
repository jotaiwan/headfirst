package chapter16;

/**
 * Created by jotaiwan on 26/04/2017.
 */
public class ListPeople {
    String name;
    int age;

    ListPeople(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, age=%d}", name, age);
    }

}

