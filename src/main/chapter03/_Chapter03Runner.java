package chapter03;


/**
 * Created by jotaiwan on 27/02/2017.
 */
public class _Chapter03Runner {

    public static void main(String[] args) {
        page061();
        page062();
        // page63 goes to HobbitPage063
        page064();
        // page065 goes to TrianglePage065
    }

    private static void page061() {
        // refer to Dog in chapter02
        DogPage061[] dogs = new DogPage061[3];
        dogs[0] = new DogPage061();
        dogs[0].name = "Fido";
        dogs[0].barking();

        System.out.println("What about dogs[2]? " + dogs[2]);
    }

    private static void page062() {
        DogPage061 d1 = new DogPage061();
        d1.barking();
        d1.name = "Bart";

        // now make a dog array
        DogPage061[] dogs = new DogPage061[4];
        dogs[0] = new DogPage061();
        dogs[1] = new DogPage061();
        dogs[2] = d1;
        dogs[3] = dogs[1];


        dogs[0].name = "Fred";
        dogs[1].name = "Market";

        System.out.println("the lastest dogs[2] name: " + dogs[2].name);

        int x = 0;
        while (x < dogs.length) {
            dogs[x].barking();
            x++;
        }

        System.out.println("what about dogs[3] name: " + dogs[3].name);
    }

    private static void page064() {
        int y = 0;
        String [] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
