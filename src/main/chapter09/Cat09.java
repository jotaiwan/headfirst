package chapter09;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public class Cat09 extends Feline09 {
    public Cat09() {
        System.out.println("Cat09 contractor");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is meow!!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats meat!!");
    }
}
