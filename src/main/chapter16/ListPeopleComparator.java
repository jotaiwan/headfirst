package chapter16;

import java.util.Comparator;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class ListPeopleComparator implements Comparator<ListPeople> {
    public int compare(ListPeople p1, ListPeople p2) {

        if (p1.name.compareTo(p2.name) > 0) {
            return 1;
        }

        if (p2.name.compareTo(p1.name) > 0) {
            return -1;
        }

        return 0;
    }

}
