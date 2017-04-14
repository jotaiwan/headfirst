package chapter14;

import chapter10.Duck277;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by jotaiwan on 8/04/2017.
 */
public class PondPage438 {
//    private Duck277 duck = new Duck277();

    transient Duck277 duck = new Duck277();     // still doesnt work.. why?

    public static void main(String[] args) {
        PondPage438 pond = new PondPage438();
        try {
            FileOutputStream fs = new FileOutputStream("./output_files/file438.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(pond);
            os.close();
        } catch (Exception ex) {
            /**
             * Dock277 is not serialiable, exception is
             * java.io.NotSerializableException: chapter14.PondPage438
             * */
            ex.printStackTrace();
        }
    }
}
