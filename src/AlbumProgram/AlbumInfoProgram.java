package AlbumProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author uhv14amu
 */
public class AlbumInfoProgram {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // First scan both text files 
//        BufferedReader playlistTxt = new BufferedReader(new FileReader("data/playlist.txt"));
//        BufferedReader albumsTxt = new BufferedReader(new FileReader("data/albums.txt"));
//
//        // Create and populate AlbumCollection, Playlist objects
//        AlbumCollection ac1 = new AlbumCollection();
//        ac1.addAlbums(albumsTxt);
//        Playlist playlist = new Playlist(ac1);
//        playlist.addPlaylistTracks(playlistTxt);
//        ArrayList albums = ac1.getCollection();
//
//        System.out.println("All albums in the albums.txt file sorted in "
//                + "alphabetical order:" + "\n");
//        //Take the album collection, sort it alphabetically then print out
//        Collections.sort(albums, Album.AlbumComparator);
//        for (int i = 0; i < albums.size(); i++) {
//            System.out.println(albums.get(i));
//        }
//
//        //Print out methods to answer tasks 3-6
//        System.out.println("\nThe total playtime of all Pink Floyd albums is:\n"
//                + ac1.getArtistPlaytime("Pink Floyd")
//                + "\n\nThe album with the most tracks is:\n" + ac1.getMostTracks()
//                + "\nwith a total of " + ac1.getMostTracks().totalTracks()
//                + " tracks.\n"
//                + "\nThe longest track in the entire collection is:\n"
//                + ac1.getLongestTrack()
//                + "\n\nThe total playtime of the entire playlist.txt file is:\n"
//                + playlist.totalDuration());
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}
