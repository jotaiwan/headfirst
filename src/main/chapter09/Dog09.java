package chapter09;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public class Dog09 extends Canine09 {
    public Dog09() {
        System.out.println("Dog09 contractor");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is bark!!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats meat!!");
    }

}
