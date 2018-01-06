package AlbumProgram;

/**
 *
 * @author uhv14amu
 */
public class Track {

    protected String songTitle; //Protected to allow usage in subclass
    protected Duration songLength; 

    public Track(String songTitle, Duration songLength) {
        this.songLength = songLength;
        this.songTitle = songTitle;
    }

    /**
     * This method is used to create Track objects using a single String line.
     *
     * @param song This parameter contains track name and duration
     */
    public Track(String song) {
        if (song.contains("0")) { //If string contains track duration
            String[] trackDivide = song.split(" - "); 
            songTitle = trackDivide[1];               
            songLength = new Duration(trackDivide[0]);
        } else { //Mostly for playlisttracks, if track has no given duration
            songTitle = song;
        }
    }

    @Override
    public String toString() {
        return songLength + " - " + songTitle;
    }

    public Duration getDuration() {
        return songLength;
    }

    public String getTitle() {
        return songTitle;
    }

    public static void main(String[] args) { //Test harness
        Track newtrack = new Track("0:04:38 - Misty Mountain Hop");
        System.out.println(newtrack.getDuration() + " - " 
                + newtrack.getTitle());
    }
}
