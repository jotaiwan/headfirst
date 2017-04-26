package chapter16;

import java.util.ArrayList;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class TestGenerics575 {

    public void go() {
        ArrayList<Animal568> animals = new ArrayList<>();
        animals.add(new Animal568());
        animals.add(new Dog568());
        animals.add(new Cat568());
        takeAnimals(animals);

        ArrayList<Dog568> dogs = new ArrayList<>();
        dogs.add(new Dog568());
        takeAnimals(dogs);

        takeAnimals2(animals);
        takeAnimals2(dogs);
    }

    public <T extends Animal568> void takeAnimals(ArrayList<T> animals) {
        System.out.println("=== <T extends Animal568> void takeAnimals(ArrayList<T> animals) ===");
        animals.add((T) new Dog568());
        for (Animal568 a : animals) {
            a.eat("animal");
        }
    }

    public void takeAnimals2(ArrayList<? extends Animal568> animals) {
        System.out.println("=== void takeAnimals2(ArrayList<? extends Animal568> animals) ===");
        for (Animal568 a : animals) {
            a.eat("animal");
        }
    }
}
