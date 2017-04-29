package chapter16;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class TestDifferenceBetweenObjectAndT {

    public static void printList1(List<Object> list) {      // object type
//        list.add(new Object());
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static <T> void printList2(List<T> list) {       // only T type
        for (T elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void printList3(List<?> list) {           // any type
        for (int i = 0;i<list.size();i++)
            System.out.println(list.get(i) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");

    /*
    * this can not pass compile , because Integer and String
    * is not subtypes of Object
    * */

        /**
         * Object和T不同点在于，Object是一个实打实的类,并没有泛指谁，可以直接给List中add(new Object())，而且Object也不能代表所有类，
         比方说String和Integer就不是Object的子类，所以Object不属于泛型类，而T是泛指所有类;
         * */
//        printList1(li);
//        printList1(ls);
        printList2(li);
        printList2(ls);
        printList3(li);
        printList3(ls);
    }
}
