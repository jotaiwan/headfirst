package chapter14;

import java.io.*;

/**
 * Created by jotaiwan on 8/04/2017.
 */
public class _chapterRunner14 {
    private static final String OUTPUT_PATH = "./output_files/";

    public static void main(String[] args) {

//        transientserialize();
//        serializable();
//        deserializable();

        page454();
        page447();
//        page437();
    }

    public static void transientserialize() {
        try
        {
            StudentInfoTransient si = new StudentInfoTransient("Abhi", 104, "110044");
            FileOutputStream fos = new FileOutputStream(OUTPUT_PATH + "student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.close();
            fos.close();            // doesnt need to be have
        }
        catch (Exception e) {
            e. printStackTrace();
        }

    }

    private static void deserializable() {
        StudentInfo si=null ;
        try {
            FileInputStream fis = new FileInputStream(OUTPUT_PATH + "student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (StudentInfo) ois.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(si.name);
        System.out. println(si.rid);
        System.out.println(si.contact);
    }

    private static void serializable() {
        try
        {
            StudentInfo si = new StudentInfo("Abhi", 104, "110044");
            FileOutputStream fos = new FileOutputStream(OUTPUT_PATH + "student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.close();
            fos.close();            // doesnt need to be have
        }
        catch (Exception e) {
            e. printStackTrace();
        }
    }

    private static void page454() {
        try {
            File myFile = new File(OUTPUT_PATH + "page447.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void page447() {
        // write a text file
        try {
            FileWriter writer = new FileWriter(OUTPUT_PATH + "page447.txt");
            writer.write("hello, how are you?\n");
            writer.write("I am fine");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void page437() {
        BoxPage437 box = new BoxPage437();
        box.setHeight(20);
        box.setWidth(50);

        try {
            /**
             * note: if the directory/path is not found, it will throw to FileNotFoundException
             * */
            FileOutputStream fs = new FileOutputStream("./output_files1/file437.ser");
            ObjectOutputStream  os = new ObjectOutputStream(fs);
            os.writeObject(box);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
