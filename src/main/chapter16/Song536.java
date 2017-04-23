package chapter16;

/**
 * Created by jotaiwan on 22/04/2017.
 */
public class Song536 {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    public Song536(String t, String a, String r, String b) {
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
