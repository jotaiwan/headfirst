package chapter08;

/**
 * Created by jotaiwan on 19/03/2017.
 */
public class TestElephant extends TestAnimal {

    private String name;

    public TestElephant(String n, int a, int w) {
        super(a, w);
        setName(n);
    }

    public TestElephant(int a, int w) {
        this("Elephant", a, w);
    }

    public TestElephant() {
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
}
