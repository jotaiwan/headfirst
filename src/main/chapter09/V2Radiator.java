package chapter09;

import java.util.ArrayList;

/**
 * Created by jotaiwan on 2/04/2017.
 */
public class V2Radiator {
    V2Radiator(ArrayList list) {
        for (int x=0; x<5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
