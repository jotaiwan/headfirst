package chapter09;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public class Dog09 extends Canine09 implements Pet09 {
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

    public void beFriendly() {
        System.out.println("I am friendly");
    }

    public void notAbstractMethod() {
        super.notAbstractMethod();
        System.out.println("I am notAbstractMethod in Dog");
    }

    @Override
    public void notAbstractButOverride() {
        System.out.println("I am notAbstractButOverride in Dog");
    }

    @Override
    public void notAbstractButOverride2() {
        super.notAbstractButOverride2();
        System.out.println("I am notAbstractButOverride2 in Dog");
    }
}