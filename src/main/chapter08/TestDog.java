package chapter08;

/**
 * Created by jotaiwan on 21/03/2017.
 */
public class TestDog extends TestAnimal implements TestDogInterface{


    private String name;

    public TestDog(String n, int a, int w) {
        super(a, w);
        setName(n);
    }

    public TestDog(int a, int w) {
        this("Elephant", a, w);
    }

    public TestDog() {
        this("Elephant", 3, 150);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (n == null || n.equals("")) {
            name = "No name defined";
        }
        else {
            name = n;
        }
    }

    public void speak() {
        System.out.println("Hello, my name is " + getName());
        System.out.println("I am " + getAge() + " years old and my weight is " + getWeight() + " kg.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is friendly");
    }


    public void play() {
        System.out.println("Dog play with human");
    }
}
