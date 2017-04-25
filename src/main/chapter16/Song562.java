package chapter16;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class Song562 implements Comparable<Song562> {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    // override the equals
    public boolean equals(Object aSong) {
        Song562 a = (Song562) aSong;
        return getTitle().equals(a.getTitle());
    }

    // override the hascode
    public int hashCode() {
        return title.hashCode();
    }

    public int compareTo(Song562 s) {
        return title.compareTo(s.getTitle());
    }

    public Song562(String t, String a, String r, String b) {
        setTitle(t);
        setArtist(a);
        setRating(r);
        setBpm(b);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }
}
