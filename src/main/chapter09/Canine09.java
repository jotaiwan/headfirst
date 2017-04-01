package chapter09;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public abstract class Canine09 extends Animal09{
    public Canine09() {
        System.out.println("Canine09 contractor");
    }

    @Override
    public void roam() {
        System.out.println("Canine's roam");
    }

    public void notAbstractMethod() {
        System.out.println("I am notAbstractMethod");
    }

    public void notAbstractButOverride() {
        System.out.println("I am notAbstractButOverride");
    }

    public void notAbstractButOverride2() {
        System.out.println("I am notAbstractButOverride2");
    }
}
