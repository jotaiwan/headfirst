package chapter06;

import java.util.ArrayList;

/**
 * Created by jotaiwan on 11/03/2017.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public String checkYourself(String stringGuess) {
        String result = "miss";
        int index = locationCells.indexOf(stringGuess);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :(");
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

}
