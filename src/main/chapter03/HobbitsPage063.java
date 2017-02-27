package chapter03;

/**
 * Created by jotaiwan on 27/02/2017.
 */
public class HobbitsPage063 {

    String name;

    public static void main(String[] args) {
        HobbitsPage063[] h = new HobbitsPage063[3];
        int z = 0;

        while (z < 3) {
            h[z] = new HobbitsPage063();
            h[z].name = "Zero array position";
            if (z == 1) {
                h[z].name = "First array position";
            }
            if (z == 2) {
                h[z].name = "Second array position";
            }
            System.out.println(h[z].name + " is a good hobbit name");
            z++;
        }
    }

}
