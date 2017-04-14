package chapter14;

import java.io.Serializable;

/**
 * Created by jotaiwan on 8/04/2017.
 */
public class GameCharacter444 implements Serializable {
    private int power;
    private String type;
    private String [] weapons;



    public GameCharacter444(int num, String name, String[] strings) {
        setPower(num);
        setType(name);
        setWeapons(strings);

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapons() {
        String weaponList = "";
        for (int i = 0; i < weaponList.length(); i++) {
            weaponList += weapons[i] + " ";
        }
        return weaponList;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    };

}
