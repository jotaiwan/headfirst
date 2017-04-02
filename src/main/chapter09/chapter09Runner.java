package chapter09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public class chapter09Runner {
    public static void main(String[] args) {

        exercise268();

        Animal09 a1 = new Dog09();
        System.out.println("*********************");

        List<Animal09> animals = new ArrayList<>();
        animals.add(new Dog09());
        animals.add(new Hippo09());

        List<Pet09> pets = new ArrayList<>();
        pets.add(new Dog09());
//        pets.add(new Hippo09());

        Dog09 dog2 = new Dog09();
        System.out.println("call notAbstractMethod now ....");
        dog2.notAbstractMethod();
        System.out.println("call notAbstractOverride now ....");
        dog2.notAbstractButOverride();
        System.out.println("call notAbstractOverride2 now ....");
        dog2.notAbstractButOverride2();
    }


    public static void exercise268() {
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for (int z=0; z<20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }

        System.out.println("finished");
    }
}