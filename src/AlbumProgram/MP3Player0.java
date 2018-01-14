package AlbumProgram;


/*************************************************************************
 *  Compilation:  javac -classpath .:jl1.0.jar MP3.java         (OS X)
 *                javac -classpath .;jl1.0.jar MP3.java         (Windows)
 *  Execution:    java -classpath .:jl1.0.jar MP3 filename.mp3  (OS X / Linux)
 *                java -classpath .;jl1.0.jar MP3 filename.mp3  (Windows)
 *  
 *  Plays an MP3 file using the JLayer MP3 library.
 *
 *  Reference:  http://www.javazoom.net/javalayer/sources.html
 *
 *
 *  To execute, get the file jl1.0.jar from the website above or from
 *
 *      http://www.cs.princeton.edu/introcs/24inout/jl1.0.jar
 *
 *  and put it in your working directory with this file MP3.java.
 *
 *************************************************************************/

import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javazoom.jl.player.Player;

public class MP3Player0 {
    
    private String filename;
    private Player player; 

    // a default constructor
    public MP3Player0() {}
        
    // Constructor takes a given file name 
    public MP3Player0(String filename) {
        this.filename = filename;
    }

    public void close() { if (player != null) player.close(); }

    // play the JLayerMP3 file to the sound card
    public void play() {
        try {
            FileInputStream fis     = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("\n Problem in playing: " + filename);
            System.out.println(e);
        }
    }
    
    public void play(String mp3filename) {
        try {
            FileInputStream fis     = new FileInputStream(mp3filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem in playing: " + mp3filename);
            System.out.println(e);
        }

        // creata a thread to play music in background
        new Thread() {
            public void run() {
                try { player.play(); }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
    }

    // test MP3Player
    public static void main(String[] args) {
        //String filename = args[0];
        String filename ="SleepAway.mp3";
       // String filepath ="C:\\awork\\teaching\\ma23\\lab6"; 
        String fileType;

        // use JFileChooser to open an MP3 file
        try{
            //use a preset file path 
            //JFileChooser openFC = new JFileChooser(filepath);
            
            JFileChooser openFC = new JFileChooser();
            Component c1 = null;
            openFC.showOpenDialog(c1);
            File mp3file = openFC.getSelectedFile();
            filename = mp3file.getAbsolutePath();
            
            //check the file format 
            //fileType= openFC.getTypeDescription(mp3file);
            //System.out.print("file type= "+ fileType);
            
        } catch( Exception e){}
        
       //MP3Player0 mp3 = new MP3Player0(filename); 
        
      // creat an instance of MP3Player0 using default constructor
        MP3Player0 mp3 = new MP3Player0();     
        mp3.play(filename);
        System.out.println("\n Playing mp3 file:" + filename);
        // the programn will stop when the track ends. 
        //mp3.close();
    }
}