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
public class JukeBox537 {

    private static final String OUTPUT_PATH = "./output_files/";

    ArrayList<Song536> songList = new ArrayList<>();

    public void go(String fileWithPath) {
        getSong(fileWithPath);
        System.out.println(songList);
//        Collections.sort(songList);           // ==> ERROR HERE: Song object doesn't implements Comparable
//        System.out.println(songList);
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
        Song536 nextSong = new Song536(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
