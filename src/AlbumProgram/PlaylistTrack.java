package AlbumProgram;

import java.util.ArrayList;

/**
 *
 * @author uhv14amu
 */
public class PlaylistTrack extends Track {

    private Album PlaylistAlbum;

    /**
     * This constructor takes in two parameters:
     *
     * @param song which contains the title of the track
     * @param PlaylistAlbum which references the album of the track. 
     * It then finds the track on the album of the same name in the collection 
     * and retrieves its duration, assigning it to variable songLength from the
     * superclass.
     */
    public PlaylistTrack(String song, Album PlaylistAlbum) {
        super(song);
        this.PlaylistAlbum = PlaylistAlbum;
        ArrayList<Track> albumTracks = PlaylistAlbum.getTracks();
        for (int i = 0; i < PlaylistAlbum.totalTracks(); i++) {
            Track albumTrack = albumTracks.get(i);
            if (albumTrack.getTitle().equals(song)) {
                songLength = albumTrack.getDuration();
            }
        }
    }

    @Override
    public String toString() {
        return songTitle + " (" + PlaylistAlbum + ")";
    }

    public Album getTrackAlbum() {
        return PlaylistAlbum;
    }

    public static void main(String[] args) { //Test Harness
        Album newalbum = new Album("Jimi Hendrix : Are you Experienced?\n",
                "0:03:22 - Foxy Lady\n"
                + "0:03:46 - Manic Depression\n"
                + "0:03:15 - 51st Anniversary\n"
                + "0:03:20 - The Wind Cries Mary\n"
                + "0:03:32 - Highway Chile");
        PlaylistTrack pl1 = new PlaylistTrack("Highway Chile", newalbum);
        System.out.println(pl1.getDuration());
    }
}
