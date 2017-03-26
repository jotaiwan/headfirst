package chapter09;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public class Test {

    public static void main(String[] args) {
        int i = 10;
        Balloon red = new Balloon("red");
        Balloon blue = new Balloon("blue");

        swap(red, blue);
        System.out.println("red color " + red.getColor());
        System.out.println("blue color " + blue.getColor());

        foo(blue);
        System.out.println("blue color " + blue.getColor());
    }


    private static void foo(Balloon balloon) {
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Blue");
    }

    private static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
}
