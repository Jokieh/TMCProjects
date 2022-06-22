
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    @Override
    public boolean equals (Object otherSong) {
        Song other = (Song) otherSong;
        if (this.artist.equals(other.artist) && this.name.equals(other.name) && this.durationInSeconds == other.durationInSeconds) return true;
        return false;
    }
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
