package chapter16;

import chapter07.Animal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class _chapterRunner16 {
    private static final String OUTPUT_PATH = "./output_files/";
    private static final String INPUT_PATH = "./input_files/";

    public static void main(String[] args) {

//        beTheCompiler();

        new TestGenerics575().go();
//        new TestGenerics572().go();
//        new TestGenerics569().go();
//        new TestGenerics568().go();

//        new MyTreeSet565().goAsc();       // TreeSet: no compareTo
//        new MyTreeSet565().goDesc();       // TreeSet: compareTo(Object o)

//        new MyTreeSet565().goWithComparator();       // TreeSet: no compareTo
//        new MyTreeSet565().goWithoutComparator();       // TreeSet: compareTo(Object o)
//        new MyTreeSet565().go();        // TreeSet: compareTo(Book565 b)

        // use Treeset, don't need to override hashCode and equals
//        p564("SongList556.txt");

        // still use HashSet, but override hashCode and equals
        // but lost the order when hashset
//        p562("SongList556.txt");

//        myEquals();
//        genericMyMap();

//        p559("SongList556.txt");        // use HashSet, has repeat value
//        p553("SongList536.txt");        // sort by song artist asc
//        p537("SongList536.txt");
//        p535("SongList530.txt");        // sort string
//        p531("SongList530.txt");
    }

    private static void beTheCompiler() {
//        ArrayList<Dog568> dogs1 = new ArrayList<>(Animal568);       // expression expected
//        ArrayList<Animal568> animals1 = new ArrayList<Dog568>();    // incompatible type
        List<Animal568> list = new ArrayList<Animal568>();
        ArrayList<Dog568> dogs = new ArrayList<Dog568>();

//        ArrayList<Animal> animals = dogs;               // incompatible type
        List<Dog568> dogList = dogs;
        ArrayList<Object> objects = new ArrayList<Object>();
        List<Object> objList = objects;
//        ArrayList<Object> objs = new ArrayList<Dog568>();   // incompatible type
    }

    private static void p564(String fileName) {
        new JukeBox564().go(INPUT_PATH + fileName );
    }

    private static void p562(String fileName) {
        new JukeBox562().go(INPUT_PATH + fileName );
    }

    public static void myEquals() {
        MyEquals s1 = new MyEquals(1, 1);
        MyEquals s2 = new MyEquals(1, 1);
        System.out.println("s1 hashcode: " + s1.hashCode());
        System.out.println("s2 hashcode: " + s2.hashCode());

        // so.. == is comparing hashcode, which is different and return false
        System.out.println(s1 == s2);       // false
        System.out.println(s1.equals(s2));  // true

        // ex
        MyEquals p1 = new MyEquals(1, 1);
        MyEquals p2 = new MyEquals(1, 1);
        Set<MyEquals> pSet = new HashSet<MyEquals>();
        pSet.add(p1);
        System.out.println(pSet.contains(p2));    // display false

    }

    private static void genericMyMap() {
        GenericMyMap<String, Integer> mp1= new GenericMyMapImpl<String, Integer>("Even", 8);
        GenericMyMap<String, String>  mp2= new GenericMyMapImpl<String, String>("hello", "world");
        GenericMyMap<Integer, Integer> mp3= new GenericMyMapImpl<Integer, Integer>(888, 888);
        System.out.println(mp1.getKey() + ", " + mp1.getValue());
        System.out.println(mp2.getKey() + ", " + mp2.getValue());
        System.out.println(mp3.getKey() + ", " + mp3.getValue());

        GenericMoreThan2Impl<String, Integer, Boolean> mx1 = new GenericMoreThan2Impl<String, Integer, Boolean>("Wow", 222, true);
        mx1.print();
    }

    private static void p559(String fileName) {
        new JukeBox559().go(INPUT_PATH + fileName );
    }

    private static void p553(String fileName) {
        new JukeBox553().go(INPUT_PATH + fileName );
    }

    private static void p537(String fileName) {
        new JukeBox537().go(INPUT_PATH + fileName );
    }

    private static void p535(String fileName) {
        new JukeBox535().go(INPUT_PATH + fileName );
    }

    private static void p531(String fileName) {
        new JukeBox531().go(INPUT_PATH + fileName );
    }
}


