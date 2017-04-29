package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class JukeBox562 {

    private static final String OUTPUT_PATH = "./output_files/";

    ArrayList<Song562> songList = new ArrayList<>();

    class ArtistCompare implements Comparator<Song562> {
        public int compare(Song562 s1, Song562 s2) {
            return s1.getArtist().compareTo(s2.getArtist());
        }
    }

    public void go(String fileWithPath) {
        getSong(fileWithPath);
        pringSongOrderByTitle();
        Collections.sort(songList);
        pringSongOrderByTitle();

        HashSet<Song562> songSet = new HashSet<>();
        songSet.addAll(songList);
        pringSongSetByTitle(songSet);
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
        Song562 nextSong = new Song562(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

    void pringSongOrderByTitle() {
        System.out.println("========== Display start title ==========");
        for (Song562 s : songList) {
            System.out.println(s.getTitle() + ", " + s.getArtist() + ", " + s.getRating() + ", " + s.getBpm());
        }
    }

    void pringSongOrderByArtist() {
        System.out.println("========== Display start artist ==========");
        for (Song562 s : songList) {
            System.out.println(s.getArtist() + ", " + s.getTitle() + ", " + s.getRating() + ", " + s.getBpm());
        }
    }

    void pringSongSetByTitle(HashSet<Song562> songSet) {
        System.out.println("========== Display songSet ==========");
        for (Song562 s : songSet) {
            System.out.println(s.getTitle() + ", " + s.getArtist() + ", " + s.getRating() + ", " + s.getBpm());
        }
    }
}
