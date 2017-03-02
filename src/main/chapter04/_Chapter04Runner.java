package chapter04;

/**
 * Created by jotaiwan on 28/02/2017.
 */
public class _Chapter04Runner {
    public static void main(String[] args) {
        page072();
        page073();
        page074();
        page082();      // example of Encapsulation
        page083();
        page084();
        page085();
    }

    private static void page072() {
        SongPage072 t2 = new SongPage072();
        t2.setArtist("Travis");
        t2.setTitle("Sing");

        SongPage072 s3 = new SongPage072();
        s3.setTitle("My Way");
        s3.setArtist("Sex Pistorls");

        t2.play();
        s3.play();
    }

    private static void page073() {
        DogPage073 one = new DogPage073();
        one.size = 70;
        one.bark();

        DogPage073 two = new DogPage073();
        two.size = 8;
        two.bark();

        DogPage073 three = new DogPage073();
        three.size = 35;
        three.bark();

    }

    private static void page074() {
        DogPage073 dog = new DogPage073();
        dog.bark(3);
    }

    private static void page082() {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one:" + one.getSize());
        System.out.println("Dog two:" + two.getSize());
        one.bark();
        two.bark();
    }

    private static void page083() {
        GoodDog[] pets;
        pets = new GoodDog[7];

        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
    }

    private static void page084() {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }

    private static void page085() {
        AddThing addThing = new AddThing();
        addThing.add();
        System.out.println("What's addThing.add(): " + addThing.add());
    }
}
