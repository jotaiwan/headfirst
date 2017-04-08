package chapter09;

import chapter07.Animal;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public abstract class Animal09 {
    public Animal09() {
        System.out.println("Animal09 contractor");
    }

    public abstract void makeNoise();
    public abstract void eat();

    public void roam() {
        System.out.println("Animal has its own roam area");
    }

    public void sleep() {
        System.out.println("Animal can sleep");
    }

}
