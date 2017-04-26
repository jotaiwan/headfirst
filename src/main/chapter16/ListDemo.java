package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jotaiwan on 26/04/2017.
 */
public class ListDemo {


    public static void main(String[] args) {
        List<ListPeople> people = Arrays.asList(
                new ListPeople("Joe", 24),
                new ListPeople("Pete", 18),
                new ListPeople("Chris", 21)
        );

        Collections.sort(people, (a, b) -> a.name.compareToIgnoreCase(b.name));
        System.out.println(people);

        Collections.sort(people, (a, b) -> a.age < b.age ? -1 : a.age == b.age ? 0 : 1);
        System.out.println(people);
    }
}
