package AlbumProgram;

import java.text.DecimalFormat;

/**
 * This class is used to create a String duration out of integer values.
 *
 * @author uhv14amu
 */

public class Duration {

    private int dSeconds;
    private int dMinutes;
    private int dHours;
    private int totalSeconds;

    public Duration(int hours, int minutes, int seconds) { //Constructor
        totalSeconds = seconds + (minutes * 60) + (hours * 3600);
        dHours = totalSeconds / 3600;
        dMinutes = (totalSeconds % 3600) / 60;
        dSeconds = totalSeconds % 60;
    }

    public Duration(String time) { //If inputting time as a String
        String[] timeDivide = time.split(":");
        totalSeconds = (Integer.parseInt(timeDivide[0]) * 3600)
                + (Integer.parseInt(timeDivide[1]) * 60)
                + Integer.parseInt(timeDivide[2]);
        dHours = totalSeconds / 3600;
        dMinutes = (totalSeconds % 3600) / 60;
        dSeconds = totalSeconds % 60;
    }

    @Override
    public String toString() { //For converting into 00:00:00 format
        DecimalFormat df = new DecimalFormat("00");
        String time = df.format(dHours)
                + ":" + df.format(dMinutes)
                + ":" + df.format(dSeconds);
        return time;
    }

    public Duration add(Duration d2) { //Adding a second duration 
        totalSeconds += d2.totalSeconds;
        dHours = totalSeconds / 3600;
        dMinutes = (totalSeconds % 3600) / 60;
        dSeconds = totalSeconds % 60;
        Duration newDuration = new Duration(dHours, dMinutes, dSeconds);
        return newDuration;
    }

    public int getHours() {
        return dHours;
    }

    public int getMinutes() {
        return dMinutes;
    }

    public int getSeconds() {
        return dSeconds;
    }
}
