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
public class TrackTest {
    
    public TrackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Track.
     */
    @Test
    public void ToString() {
        System.out.println("toString");
        Track instance = new Track("00:04:38 - Misty Mountain Hop");
        String expResult = "00:04:38 - Misty Mountain Hop";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class Track.
     */
    @Test
    public void GetDuration() {
        System.out.println("getDuration");
        Track instance = new Track("00:05:08 - Misty Mountain Hop");
        Duration expResult = new Duration(0,5,8);
        Duration result = instance.getDuration();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of getTitle method, of class Track.
     */
    @Test
    public void GetTitle() {
        System.out.println("getTitle");
        Track instance = new Track("0:04:38 - Misty Mountain Hop");
        String expResult = "Misty Mountain Hop";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class Track.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Track.main(args);
    }
    
}
