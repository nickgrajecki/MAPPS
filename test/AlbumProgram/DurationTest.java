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
public class DurationTest {
    
    public DurationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Duration.
     */
    @Test
    public void ToString() {
        System.out.println("toString");
        Duration instance = new Duration(1,1,1);
        String expResult = "01:01:01";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Duration.
     */
    @Test
    public void Add() {
        System.out.println("add");
        Duration d2 = new Duration (1,1,1);
        Duration instance = new Duration(0,0,0);
        Duration expResult = new Duration (1,1,1);
        Duration result = instance.add(d2);

    }

    /**
     * Test of getHours method, of class Duration.
     */
    @Test
    public void GetHours() {
        System.out.println("getHours");
        Duration instance = new Duration(1,2,3);
        int expResult = 01;
        int result = instance.getHours();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMinutes method, of class Duration.
     */
    @Test
    public void GetMinutes() {
        System.out.println("getMinutes");
        Duration instance = new Duration(1,2,3);
        int expResult = 02;
        int result = instance.getMinutes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSeconds method, of class Duration.
     */
    @Test
    public void GetSeconds() {
        System.out.println("getSeconds");
        Duration instance = new Duration(1,2,3);
        int expResult = 03;
        int result = instance.getSeconds();
        assertEquals(expResult, result);
    }
    
}
