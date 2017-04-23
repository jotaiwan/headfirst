package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class JukeBox564 {

    private static final String OUTPUT_PATH = "./output_files/";

    ArrayList<Song550> songList = new ArrayList<>();

    class ArtistCompare implements Comparator<Song550> {
        public int compare(Song550 s1, Song550 s2) {
            return s1.getArtist().compareTo(s2.getArtist());
        }
    }

    public void go(String fileWithPath) {
        getSong(fileWithPath);
        pringSongOrderByTitle();
        Collections.sort(songList);
        pringSongOrderByTitle();

        TreeSet<Song550> songSet = new TreeSet<Song550>();
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
        Song550 nextSong = new Song550(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

    void pringSongOrderByTitle() {
        System.out.println("========== Display start title ==========");
        for (Song550 s : songList) {
            System.out.println(s.getTitle() + ", " + s.getArtist() + ", " + s.getRating() + ", " + s.getBpm());
        }
    }

    void pringSongOrderByArtist() {
        System.out.println("========== Display start artist ==========");
        for (Song550 s : songList) {
            System.out.println(s.getArtist() + ", " + s.getTitle() + ", " + s.getRating() + ", " + s.getBpm());
        }
    }

    void pringSongSetByTitle(HashSet<Song550> songSet) {
        System.out.println("========== Display songSet (HashSet) ==========");
        for (Song550 s : songSet) {
            System.out.println(s.getTitle() + ", " + s.getArtist() + ", " + s.getRating() + ", " + s.getBpm());
        }
    }


    void pringSongSetByTitle(TreeSet<Song550> songSet) {
        System.out.println("========== Display songSet (TreeSet) ==========");
        for (Song550 s : songSet) {
            System.out.println(s.getTitle() + ", " + s.getArtist() + ", " + s.getRating() + ", " + s.getBpm());
        }
    }
}
