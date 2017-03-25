package chapter08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class chapter08Runner {

    public static void main(String[] args) {

        testAnimalPolymorphism();

//        testAnimal();
//        polymorphismExample();
//
//        page212();
//        superStudent();
//
//        superPerson();
    }

    private static void testAnimalPolymorphism() {
        List<TestAnimal> animals = new ArrayList<>();
        TestDogInterface dogInterface = new TestDog("interface", 5, 7);
        dogInterface.beFriendly();
//        dogInterface.speak();  // compile/runtime error

        System.out.println("*****************");
        TestDog testDog = new TestDog("Curry", 12, 10);
        testDog.speak();
        testDog.beFriendly();

        TestAnimal animal = new TestAnimal() {
            @Override
            public void speak() {

            }
        };
    }

    private static void testAnimal() {
        TestElephant puppy1 = new TestElephant("Elephant", 6, 70);
        puppy1.speak();
        TestElephant puppy2 = new TestElephant(10, 142);
        puppy2.speak();
    }

    private static void polymorphismExample() {
        Operater(new PolymorphismAirConditioner("Pansonic"));
        Operater(new PolymorphismElectronicDoor("National"));
    }

    //Super Remote Controller
    public static void Operater(PolymorphismRemoteControl oRC)
    {
        System.out.println("RemoteName: " + oRC.getName());
        System.out.println(oRC.turnOn());
        System.out.println(oRC.turnOff());
    }

    private static void page212() {
        DogChapter08 aDog = new DogChapter08();
        Object sameDog = getObject(aDog);
        System.out.println("has code for aDog: " + aDog.hashCode());
        System.out.println("has code for sameDog: " + sameDog.hashCode());
    }

    private static Object getObject(Object o) {
        return o;
    }

    private static void superStudent() {
        System.out.println("\n");
        SuperSonStudent Lung = new SuperSonStudent(65,164,99);
        Lung.showData();
    }

    private static void superPerson() {
        SuperChinese c = new SuperChinese();
        c = new SuperChinese("Kelvin");
        c = new SuperChinese("Kelvin", 30);
    }
}
