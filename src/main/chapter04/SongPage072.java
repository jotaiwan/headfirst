package chapter04;

/**
 * Created by jotaiwan on 28/02/2017.
 */
public class SongPage072 {
    String title;
    String artist;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play() {
        System.out.print("Current play title: " + title);
        System.out.println(", the artist is " + artist);
    }
}
