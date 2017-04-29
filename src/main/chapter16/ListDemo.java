package chapter16;

import java.util.ArrayList;
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

        ListPeopleComparator comparator = new ListPeopleComparator();
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
