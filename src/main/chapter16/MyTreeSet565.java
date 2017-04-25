package chapter16;

import java.util.TreeSet;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class MyTreeSet565 {
    public void go() {
        Book565 b1 = new Book565("How Cats Work");
        Book565 b2 = new Book565("Remix your Body");
        Book565 b3 = new Book565("Finding Emo");

        TreeSet<Book565> tree = new TreeSet<Book565>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree.toString());
//        print1(tree);
    }

    public void go1() {
        Book5651 b1 = new Book5651("How Cats Work");
        Book5651 b2 = new Book5651("Remix your Body");
        Book5651 b3 = new Book5651("Finding Emo");

        TreeSet<Book5651> tree = new TreeSet<Book5651>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree.toString());
//        print2(tree);
    }

    public void go2() {
        Book566 b1 = new Book566("How Cats Work");
        Book566 b2 = new Book566("Remix your Body");
        Book566 b3 = new Book566("Finding Emo");

        BookCompare566 bookCompare566 = new BookCompare566();
        TreeSet<Book566> tree = new TreeSet<Book566>(bookCompare566);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree.toString());
//        print3(tree);

    }

    private void print1(TreeSet<Book565> t) {
        System.out.println("=== start print1 ===");
        for (Book565 b : t) {
            System.out.println(b.getTitle());
        }
    }

    private void print2(TreeSet<Book5651> t) {
        System.out.println("=== start print2 ===");
        for (Book5651 b : t) {
            System.out.println(b.getTitle());
        }
    }

    private void print3(TreeSet<Book566> t) {
        System.out.println("=== start print3 ===");
        for (Book566 b : t) {
            System.out.println(b.getTitle());
        }
    }
}
