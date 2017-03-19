package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class chapter08Runner {

    public static void main(String[] args) {

        testAnimal();
        polymorphismExample();
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
}
