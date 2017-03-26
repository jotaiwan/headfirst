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

}
