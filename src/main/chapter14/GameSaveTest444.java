package chapter14;

import java.io.*;

/**
 * Created by jotaiwan on 8/04/2017.
 */
public class GameSaveTest444 {

    public static void main(String[] args) {
        GameCharacter444 one = new GameCharacter444(50, "Elf", new String[]{"bow", "sword", "dust"});
        GameCharacter444 two = new GameCharacter444(200, "Troll", new String[]{"bare hands", "big ax"});
        GameCharacter444 three = new GameCharacter444(120, "Magician", new String[]{"spells", "invisibility"});

        // imagine code that does things with the characters that might change their state values
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./output_files/Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        one = null;
        two = null;
        three = null;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("./output_files/Game.ser"));
            GameCharacter444 oneRestore = (GameCharacter444) is.readObject();
            GameCharacter444 twoRestore = (GameCharacter444) is.readObject();
            GameCharacter444 threeRestore = (GameCharacter444) is.readObject();
            System.out.println("One’s type: "+oneRestore.getType());
            System.out.println("Two’s type: "+twoRestore.getType());
            System.out.println("Three’s type: "+threeRestore.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


