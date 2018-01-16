/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlbumProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
public class AlbumCollectionTest {
    
    public AlbumCollectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addAlbum method, of class AlbumCollection.
     */
    @Test
    public void AddAlbum() {
        System.out.println("addAlbum");
        Album newAlbum = new Album("The Jimi Hendrix Experience : Are you Experienced?");
        AlbumCollection instance = new AlbumCollection();
        instance.addAlbum(newAlbum);
    }

    /**
     * Test of addAlbums method, of class AlbumCollection.
     */
    @Test
    public void AddAlbums() throws FileNotFoundException, IOException {
        System.out.println("addAlbums");
        BufferedReader f = new BufferedReader(new FileReader("data/albums.txt"));
        AlbumCollection instance = new AlbumCollection();
        instance.addAlbums(f);
    }

    /**
     * Test of getCollection method, of class AlbumCollection.
     */
    @Test
    public void GetCollection() {
        System.out.println("getCollection");
        AlbumCollection instance = new AlbumCollection();
        Album newA = new Album ("Pink Floyd : Dark Moon");
        Duration d1 = new Duration (1,2,3);
        Track t1 = new Track ("Moon", d1);
        newA.addTrack(t1);
        instance.addAlbum(newA);
        ArrayList resultArray = new ArrayList<>();
        resultArray.add(newA);
        ArrayList expResult = resultArray;
        ArrayList result = instance.getCollection();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlbum method, of class AlbumCollection.
     */
    @Test
    public void GetAlbum() {
        System.out.println("getAlbum");
        int x = 0;
        AlbumCollection instance = new AlbumCollection();
        Album newA = new Album ("Pink Floyd : Dark Moon");
        instance.addAlbum(newA);
        Album expResult = newA;
        Album result = instance.getAlbum(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of getArtistPlaytime method, of class AlbumCollection.
     */
    @Test
    public void GetArtistPlaytime() {
        System.out.println("getArtistPlaytime");
        String artist = "Pink Floyd";
        AlbumCollection instance = new AlbumCollection();
        Album newA = new Album ("Pink Floyd : Dark Moon");
        Duration d1 = new Duration (1,2,3);
        Track t1 = new Track ("Moon", d1);
        newA.addTrack(t1);
        instance.addAlbum(newA);
        Duration expResult = d1;
        Duration result = instance.getArtistPlaytime(artist);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getMostTracks method, of class AlbumCollection.
     */
    @Test
    public void GetMostTracks() {
        System.out.println("getMostTracks");
        AlbumCollection instance = new AlbumCollection();
        Album newA = new Album ("Pink Floyd : Dark Moon");
        Duration d1 = new Duration (1,2,3);
        Track t1 = new Track ("Moon", d1);
        newA.addTrack(t1);
        instance.addAlbum(newA);
        Album expResult = newA;
        Album result = instance.getMostTracks();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLongestTrack method, of class AlbumCollection.
     */
    @Test
    public void GetLongestTrack() {
        System.out.println("getLongestTrack");
        AlbumCollection instance = new AlbumCollection();
        Album newA = new Album ("Pink Floyd : Dark Moon");
        Duration d1 = new Duration (1,2,3);
        Track t1 = new Track ("Moon", d1);
        newA.addTrack(t1);
        instance.addAlbum(newA);
        Track expResult = t1;
        Track result = instance.getLongestTrack();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class AlbumCollection.
     */
    @Test
    public void ToString() {
        System.out.println("toString");
        AlbumCollection instance = new AlbumCollection();
        Album newA = new Album ("Pink Floyd : Dark Moon");
        Duration d1 = new Duration (1,2,3);
        Track t1 = new Track ("Moon", d1);
        newA.addTrack(t1);
        instance.addAlbum(newA);
        String expResult = "Pink Floyd : Dark Moon";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
