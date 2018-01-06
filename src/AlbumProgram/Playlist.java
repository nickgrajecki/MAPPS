package AlbumProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uhv14amu
 */
public class Playlist {

    private ArrayList<PlaylistTrack> playlistTracks;
    private AlbumCollection albumCollection;

    public Playlist(AlbumCollection albumCollection) { //Default constructor
        playlistTracks = new ArrayList<>();
        this.albumCollection = albumCollection;
    }

    /**
     * This method populates the playlistTracks array. It scans line by line,
     * separating each string into track and album.
     *
     * @param f points to a scanner which reads in the Playlist file. After
     * splitting the album title, it then attempts to find a matching album on
     * the corresponding AlbumCollection - if a match is made, it then uses the
     * album object from AlbumCollection to create a new PlaylistTrack object.
     */
    public void addPlaylistTracks(Scanner f) {
        while (f.hasNextLine()) {
            String nextLine = f.nextLine();
            String[] playlistDivide = nextLine.split(" \\(");
            String track = playlistDivide[0];
            Album trackAlbum
                    = new Album(playlistDivide[1].replaceAll("\\)", ""));
            ArrayList albumsC = albumCollection.getCollection();
            for (int i = 0; i < albumsC.size(); i++) {
                Album collectionAlbum = (Album) albumsC.get(i);
                if (trackAlbum.getTitle().equals(collectionAlbum.getTitle())) {
                    trackAlbum = collectionAlbum;
                }
            }
            PlaylistTrack pltrack = new PlaylistTrack(track, trackAlbum);
            playlistTracks.add(pltrack);
        }
    }

    public void addTrack(PlaylistTrack playlistTrack) {
        playlistTracks.add(playlistTrack);
    }

    public PlaylistTrack getPlaylistTrack(int x) {
        return playlistTracks.get(x);
    }
    
    public int totalTracks() {
        return playlistTracks.size();
    }

    public ArrayList getPlaylistTracks() {
        ArrayList<PlaylistTrack> returnPlaylist = new ArrayList<>();
        for (PlaylistTrack newTrack : playlistTracks) {
            returnPlaylist.add(newTrack);
        }
        return returnPlaylist;
    }
//
//    @Override
//    public String toString() {
//        return playlistTracks.toString().replaceAll("\\[", "")
//                .replaceAll("\\]", "")
//                .replaceAll(", ", "\n");
//    }

    /**
     * This method calculates the total Duration of a Playlist object. It
     * iterates through every PlaylistTrack object in the Playlist, retrieving
     * its Duration and adding it to a running total (tduration).
     */
    public Duration totalDuration() {
        Duration tDuration = new Duration(0, 0, 0);
        for (int i = 0; i < playlistTracks.size(); i++) {
            tDuration.add((playlistTracks.get(i)).getDuration());
        }
        return tDuration;
    }
}
