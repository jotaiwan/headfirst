package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class JukeBox535 {

    private static final String OUTPUT_PATH = "./output_files/";

    ArrayList<String> songList = new ArrayList<>();

    public void go(String fileWithPath) {
        getSong(fileWithPath);
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSong(String fileWithPath) {
        try {
            File file = new File(fileWithPath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();;
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
