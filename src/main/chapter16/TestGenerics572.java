package chapter16;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class TestGenerics572 {

    public void go() {
        Animal568[] animals = {new Dog568(), new Cat568(), new Dog568()};
        Dog568[] dogs = {new Dog568(), new Dog568(), new Dog568()};
        takeAnimals(animals);
        takeAnimals(dogs);

    }

    public void takeAnimals(Animal568[] animals) {
        animals[0] = new Cat568();
        for (Animal568 a : animals) {
            a.eat("animal");
        }
    }
}
