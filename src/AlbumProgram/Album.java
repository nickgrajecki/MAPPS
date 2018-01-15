package AlbumProgram;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author uhv14amu
 */
public class Album implements Comparable {

    private String artist;
    private String albumTitle;
    private ArrayList<Track> tracks;

    public Album() {
        tracks = new ArrayList<>();
        artist = null;
        albumTitle = null;
    }

    public Album(String splitAlbum) { //If only album name provided
        String[] albumDivide = splitAlbum.split(" : ");
        artist = albumDivide[0];
        albumTitle = albumDivide[1];
        tracks = new ArrayList<>();
    }

    public Album(String splitAlbum, String songs) { //Album name + songs as string
        String[] albumDivide = splitAlbum.split(" : ");
        artist = albumDivide[0];
        albumTitle = albumDivide[1];
        tracks = new ArrayList<>();
        String[] tracksDivide = songs.split("\n");
        for (String trackLoop : tracksDivide) {
            Track t1 = new Track(trackLoop);
            tracks.add(t1);
        }
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return albumTitle;
    }

    public ArrayList getTracks() {
        ArrayList newSongs = new ArrayList<>();
        for (Track newTrack : tracks) {
            newSongs.add(newTrack);
        }
        return newSongs;
    }

    public Track getTrack(int x) {
        return tracks.get(x);
    }

    public String getAll() { //Retrieve all details, including tracks
        return artist + " : " + albumTitle + "\n" + tracks.toString()
                .replaceAll("\\[","").replaceAll("\\]", "");
    }

    /**
     * This method is used to calculate the combined duration of all tracks
     */
    public Duration getPlayTime() {
        Duration totalDuration = new Duration(0, 0, 0);
        for (int i = 0; i < tracks.size(); i++) {
            totalDuration.add(tracks.get(i).getDuration());
        }
        return totalDuration;
    }

    public void addTrack(String f) {
        Track newTrack = new Track(f);
        tracks.add(newTrack);
    }

    public void addTrack(Track t) {
        tracks.add(t);
    }

    @Override
    public String toString() {
        return artist + " : " + albumTitle;
    }

    public int totalTracks() { //Retrieves number of tracks in an album
        int allTracks = tracks.size();
        return allTracks;
    }

    /**
     * This method sorts albums alphabetically based on artist and album title.
     * It compares the artist names and if they return a value of 0 that means
     * it's the same artist - in which case the method then compares the titles
     * of both albums and sorts them accordingly.
     */
    public static Comparator<Album> AlbumComparator = new Comparator<Album>() {
        @Override
        public int compare(Album album1, Album album2) {
            int compareArtists = album1.getArtist()
                    .compareTo(album2.getArtist());
            if (compareArtists == 0) {
                return album1.getTitle().compareTo(album2.getTitle());
            }
            return compareArtists;
        }
    };

    @Override
    public int compareTo(Object O) { //Comparator requirement
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
