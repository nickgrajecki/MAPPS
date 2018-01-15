package AlbumProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author uhv14amu
 */
public class AlbumCollection {

    private ArrayList<Album> aCollection;

    public AlbumCollection() { //Default constructor 
        aCollection = new ArrayList<>();
    }

    public void addAlbum(Album newAlbum) { //Add single album
        aCollection.add(newAlbum);
    }

    /**
     * This method adds albums to the aCollection ArrayList from a file by
     * scanning it line by line. If the line is an Album then it creates a new
     * Album object and adds subsequent track lines to it. Once it reaches the
     * next Album line, it adds the previous Album object to the array before
     * creating a new Album object.
     *
     * @param f points to the scanner used to read the file
     */
    public void addAlbums(BufferedReader br) throws IOException {
        Album newAlbum = null;
        String nextLine;
        while ((nextLine = br.readLine()) != null) {
            if (nextLine.contains(" : ")) {
                if (newAlbum != null) { //Ignore empty albums
                    aCollection.add(newAlbum);
                }
                newAlbum = new Album(nextLine);
            } else if (nextLine.contains(" - ")) {
                newAlbum.addTrack(nextLine);
            }
        }
        aCollection.add(newAlbum); //Add last album
    }

    public ArrayList getCollection() { //Retrieve arraylist of albums
        ArrayList<Album> returnAlbums = new ArrayList<>();
        for (Album newAlbum : aCollection) {
            returnAlbums.add(newAlbum);
        }
        return returnAlbums;
    }

    public Album getAlbum(int x) { //Retrieve arraylist of albums
        return aCollection.get(x);
    }

    /**
     * This method retrieves the combined playtime of all tracks on all albums
     * by an artist specified as the artist String.
     *
     * @param artist is the user-specified artist whose albums playtime will be
     * calculated
     */
    public Duration getArtistPlaytime(String artist) {
        Duration totalDuration = new Duration(0, 0, 0);
        for (int i = 0; i < aCollection.size(); i++) {
            if (artist.equalsIgnoreCase(aCollection.get(i).getArtist())) {
                totalDuration.add(aCollection.get(i).getPlayTime());
            }
        }
        return totalDuration;
    }

    /**
     * This method finds the album with the longest track list within the album
     * collection. It goes through the entire album collection, counting tracks
     * per album and using an if function to determine whether it's bigger than
     * variable biggestAlbum; if so, it assigns the larger value to the variable
     */
    public Album getMostTracks() {
        //Set it to the first album in the collection by default
        Album biggestAlbum = aCollection.get(0);
        for (int i = 0; i < aCollection.size(); i++) {
            Album tempAlbum = aCollection.get(i);
            if (tempAlbum.totalTracks() > biggestAlbum.totalTracks()) {
                biggestAlbum = tempAlbum;
            }
        }
        return biggestAlbum;
    }

    /**
     * This method finds the longest track in the collection by creating a
     * nested loop which goes through every track on every album and compares it
     * to the duration of variable longestTrack. The longer value is then
     * assigned to longestTrack.
     */
    public Track getLongestTrack() {
        Track longestTrack = new Track("0:00:00 - Default Track");
        Album longAlbum = new Album("Placeholder : Album");
        for (int i = 0; i < aCollection.size(); i++) {
            Album album = aCollection.get(i);
            for (int x = 0; x < album.totalTracks(); x++) {
                Track tempTrack = album.getTrack(x);
                Duration tempDuration = tempTrack.getDuration();
                Duration longestDuration = longestTrack.getDuration();
                if (tempDuration.getMinutes() > longestDuration.getMinutes()) {
                    longestTrack = tempTrack;
                    longAlbum = album;
                } else if (tempDuration.getMinutes()
                        == longestDuration.getMinutes()
                        && tempDuration.getSeconds()
                        > longestDuration.getSeconds()) {
                    longestTrack = tempTrack;
                    longAlbum = album;
                }
            }
        }
        return longestTrack;
    }

    @Override
    public String toString() {
        return aCollection.toString().replaceAll(", ", "\n")
                .replaceAll("\\[", "")
                .replaceAll("\\]", "");
    }
}
