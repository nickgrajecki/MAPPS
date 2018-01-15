/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlbumProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thegr
 */
public class PlaylistTest {

    public PlaylistTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addPlaylistTracks method, of class Playlist.
     */
    @Test
    public void AddPlaylistTracks() throws FileNotFoundException {
        System.out.println("addPlaylistTracks");
        Scanner f = new Scanner(new File("data/playlist.txt"));
        Playlist instance = new Playlist(new AlbumCollection());
        instance.addPlaylistTracks(f);
    }

    /**
     * Test of addTrack method, of class Playlist.
     */
    @Test
    public void AddTrack() {
        System.out.println("addTrack");
        Album newAlbum = new Album("Pulp : Different Class");
        PlaylistTrack playlistTrack = new PlaylistTrack("Monday Morning", newAlbum);
        Playlist instance = new Playlist(new AlbumCollection());
        instance.addTrack(playlistTrack);
    }

    /**
     * Test of getPlaylistTrack method, of class Playlist.
     */
    @Test
    public void GetPlaylistTrack() {
        System.out.println("getPlaylistTrack");
        int x = 0;
        Album newAlbum = new Album("Pulp : Different Class");
        PlaylistTrack plTrack = new PlaylistTrack("Monday Morning", newAlbum);
        Playlist instance = new Playlist(new AlbumCollection());
        instance.addTrack(plTrack);
        PlaylistTrack expResult = plTrack;
        PlaylistTrack result = instance.getPlaylistTrack(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of totalTracks method, of class Playlist.
     */
    @Test
    public void TotalTracks() {
        System.out.println("totalTracks");
        Album newAlbum = new Album("Pulp : Different Class");
        PlaylistTrack plTrack = new PlaylistTrack("Monday Morning", newAlbum);
        Playlist instance = new Playlist(new AlbumCollection());
        instance.addTrack(plTrack);
        int expResult = 1;
        int result = instance.totalTracks();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlaylistTracks method, of class Playlist.
     */
    @Test
    public void GetPlaylistTracks() {
        System.out.println("getPlaylistTracks");
        Album newAlbum = new Album("Pulp : Different Class");
        PlaylistTrack plTrack = new PlaylistTrack("Monday Morning", newAlbum);
        Playlist instance = new Playlist(new AlbumCollection());
        instance.addTrack(plTrack);
        ArrayList resultArray = new ArrayList<>();
        resultArray.add(plTrack);
        ArrayList expResult = resultArray;
        ArrayList result = instance.getPlaylistTracks();
        assertEquals(expResult, result);
    }

    /**
     * Test of totalDuration method, of class Playlist.
     */
    @Test
    public void TotalDuration() {
        System.out.println("totalDuration");
        Album newAlbum = new Album("Pulp : Different Class");
        Duration d1 = new Duration (0,2,3);
        newAlbum.addTrack(new Track ("Maria", d1));
        PlaylistTrack plTrack = new PlaylistTrack("Maria", newAlbum);
        AlbumCollection ac = new AlbumCollection();
        ac.addAlbum(newAlbum);
        Playlist instance = new Playlist(ac);
        instance.addTrack(plTrack);
        Duration expResult = d1;
        Duration result = instance.totalDuration();
        assertEquals(expResult.toString(), result.toString());
    }

}
