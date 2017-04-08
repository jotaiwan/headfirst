package chapter09;

/**
 * Created by jotaiwan on 2/04/2017.
 */
public class SimUnit {
    String botType;

    SimUnit(String type) {
        System.out.println("created by: " + type);
        botType = type;
    }

    int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }

}
