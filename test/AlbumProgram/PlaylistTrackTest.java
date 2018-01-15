/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlbumProgram;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thegr
 */
public class PlaylistTrackTest {
    
    public PlaylistTrackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class PlaylistTrack.
     */
    @Test
    public void ToString() {
        System.out.println("toString");
        PlaylistTrack instance = new PlaylistTrack("Monday Morning", new Album ("Pulp : Different Class"));
        String expResult = "Monday Morning (Pulp : Different Class)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTrackAlbum method, of class PlaylistTrack.
     */
    @Test
    public void GetTrackAlbum() {
        System.out.println("getTrackAlbum");
        Album newAlbum = new Album ("Pulp : Different Class");
        PlaylistTrack instance = new PlaylistTrack("Monday Morning", newAlbum);
        Album expResult = newAlbum;
        Album result = instance.getTrackAlbum();
        assertEquals(expResult, result);

    }

    /**
     * Test of main method, of class PlaylistTrack.
     */
    @Test
    public void Main() {
        System.out.println("main");
        String[] args = null;
        PlaylistTrack.main(args);
    }
    
}
