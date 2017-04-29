package chapter16;

import java.util.ArrayList;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class TestGenerics569 {

    public void go() {
        ArrayList<Animal568> animals = new ArrayList<>();
        animals.add(new Animal568());
        animals.add(new Dog568());
        animals.add(new Cat568());
        takeAnimals(animals);

//        ArrayList<Dog568> dogs = new ArrayList<>();
//        dogs.add(new Dog568());
//        takeAnimals(dogs);
    }

    public void takeAnimals(ArrayList<Animal568> animals) {
        for (Animal568 a : animals) {
            a.eat("animal");
        }
    }
}
