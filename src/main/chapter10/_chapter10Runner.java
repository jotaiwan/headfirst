package chapter10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static java.lang.String.format;

/**
 * Created by jotaiwan on 1/04/2017.
 */
public class _chapter10Runner {

    public static void main(String[] args) {


        page305();
        page301();
        page300();
        page294();
        page288();
        page286();
        page283();
        page282();
        page281();
        page279();
        page275();
        page274();

        Math.ceil(5.5);
        Math.floor(6.3);

        System.out.println(format("%d", 42));
        System.out.println(format("%.3f", 42.000000));
        System.out.println(format("%c", 65));
    }


    private static void page305() {
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("add 35 days " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("roll 35 days " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("set to 1 " + c.getTime());


        // displays the current calendar
        System.out.println("Month is " + c.get(Calendar.MONTH));

        // roll month
        c.roll(Calendar.MONTH, true);

        // print result after rolling
        System.out.println("Month is (true) " + c.get(Calendar.MONTH));

        // roll downwards
        c.roll(Calendar.MONTH, false);

        // print result after rolling down
        System.out.println("Month is (false) " + c.get(Calendar.MONTH));
    }

    private static void page301() {
        System.out.println("%tc : " + format("%tc", new Date()));
        System.out.println("%tr : " + format("%tr", new Date()));
        System.out.println("%tA : " + format("%tA", new Date()));
        System.out.println("%tB : " + format("%tB", new Date()));
        System.out.println("%tC : " + format("%tC", new Date()));

        System.out.println("%tA, %tB %tC : " + format("%tA, %tB %tC", new Date(), new Date(), new Date()));
        System.out.println("%tA, %tB %tC : " + format("%tA, %<tB %<tC", new Date()));

    }

    private static void page300() {
        int one = 20456654;
        double two = 100567890.248907;
        System.out.println(format("The rank is %,d out of %,.2f", one, two));
    }

    private static void page294() {
        String s = format("%, d", 1000000000);
        System.out.println(s);

        // doesn't work Page: 296
        System.out.println(format("I have %.2f bugs to fix.", 456789.02548));
        System.out.println(format("I have %,.2f bugs to fix.", 456789.02548));

        System.out.println(format("I have %x bugs to fix.", 42));
        System.out.println(format("I have %c bugs to fix.", 42));
    }

    private static void page288() {
        // before java 5
        ArrayList listOfNumbers = new ArrayList();
        listOfNumbers.add(new Integer(3));
        Integer one = (Integer) listOfNumbers.get(0);
        int intOne = one.intValue();
        System.out.println("intOne is " + intOne);

        // now..
        ArrayList<Integer> listOfNumbers1 = new ArrayList<>();
        listOfNumbers1.add(3);
        int num = listOfNumbers1.get(0);
        System.out.println("num is " + num);
    }

    private static void page286() {
        double r1 = Math.random();
        int r2 = (int) (Math.random() * 5);

        int x = Math.abs(-240);
        double d = Math.abs(240.25);

        int a = Math.round(-24.8f);
        int b = Math.round(24.45f);

        int c = Math.min(24, 240);
        double e = Math.min(90876.5, 90876.49);

        int f = Math.max(24, 240);
        double g = Math.max(90876.5, 90876.49);

        // Math.sqrt
        Math.sqrt(5d);

        // Math.tan
        Math.tan(5d);

        // Math.ceil
        Math.ceil(5d);

        // Math.floow
        Math.floor(5d);

        // Math.asin
        Math.asin(5d);

        System.out.println("r1 is " + r1);
        System.out.println("r2 is " + r2);
        System.out.println("x is " + x);
        System.out.println("d is " + d);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println("e is " + e);
        System.out.println("f is " + f);
        System.out.println("g is " + g);

        System.out.println("Math.sqrt(5d) is " + Math.sqrt(5d));
        System.out.println("Math.tan(5d) is " + Math.tan(5d));
        System.out.println("Math.ceil(5d) is " + Math.ceil(5d));
        System.out.println("Math.floor(5d) is " + Math.floor(5d));
        System.out.println("Math.asin(5d) is " + Math.asin(5d));

    }

    private static void page283() {
        Foof283 foo = new Foof283();
        foo.doStuff(10);
    }

    private static void page282() {
        System.out.println("BAR_SIGN is " + Bar282.BAR_SIGN);
    }

    private static void page281() {
        System.out.println("playerCount : " + Player281.playerCount);
        Player281 player = new Player281("wow");
        System.out.println("playerCount : " + Player281.playerCount);
    }

    private static void page279() {
        Duck277 dock1 = new Duck277();
        Duck277 dock2 = new Duck277();
    }

    private static void page275() {
        Song275 song = new Song275("the song");
        song.play();

        System.out.println("Math: " + Math.min(390, 39));
    }

    private static void page274() {
        int x = (int) Math.round(42.2);
        int y = Math.min(56, 12);
        int z = Math.abs(-243);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
