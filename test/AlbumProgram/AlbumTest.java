/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlbumProgram;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thegr
 */
public class AlbumTest {

    public AlbumTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getArtist method, of class Album.
     */
    @Test
    public void GetArtist() {
        System.out.println("getArtist");
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        String expResult = "The Jimi Hendrix Experience";
        String result = instance.getArtist();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Album.
     */
    @Test
    public void GetTitle() {
        System.out.println("getTitle");
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        String expResult = "Are you Experienced?";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTracks method, of class Album.
     */
    @Test
    public void GetTracks() {
        System.out.println("getTracks");
        Album instance
                = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        Track t1 = new Track ("00:03:22 - Foxy Lady");
        instance.addTrack(t1);
        ArrayList expResult = new ArrayList();
        expResult.add(t1);
        ArrayList result = instance.getTracks();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTrack method, of class Album.
     */
    @Test
    public void GetTrack() {
        System.out.println("getTrack");
        int x = 0;
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        Track t1 = new Track("0:03:22 - Foxy Lady\n");
        instance.addTrack(t1);
        Track expResult = t1;
        Track result = instance.getTrack(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class Album.
     */
    @Test
    public void GetAll() {
        System.out.println("getAll");

        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        Track t1 = new Track("00:03:22 - Foxy Lady");
        instance.addTrack(t1);
        String expResult = "The Jimi Hendrix Experience : Are you Experienced?\n00:03:22 - Foxy Lady";
        String result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayTime method, of class Album.
     */
    @Test
    public void GetPlayTime() {
        System.out.println("getPlayTime");
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        Duration d1 = new Duration (0,3,22);
        Track t1 = new Track("Foxy Lady", d1);
        instance.addTrack(t1);
        Duration expResult = d1;
        Duration result = instance.getPlayTime();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of addTrack method, of class Album.
     */
    @Test
    public void AddTrack_String() {
        System.out.println("addTrack");
        String f = "0:03:22 - Foxy Lady";
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        instance.addTrack(f);
    }

    /**
     * Test of addTrack method, of class Album.
     */
    @Test
    public void AddTrack_Track() {
        System.out.println("addTrack");
        Track t = new Track("0:03:22 - Foxy Lady");
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        instance.addTrack(t);
    }

    /**
     * Test of toString method, of class Album.
     */
    @Test
    public void ToString() {
        System.out.println("toString");
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        String expResult = "The Jimi Hendrix Experience : Are you Experienced?";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of totalTracks method, of class Album.
     */
    @Test
    public void TotalTracks() {
        System.out.println("totalTracks");
        Album instance = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        int expResult = 0;
        int result = instance.totalTracks();
        assertEquals(expResult, result);
    }
}
