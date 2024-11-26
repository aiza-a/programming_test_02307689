import shape.Square;

import java.awt.*;

public class Drone {
    private String name;
    private int frequency;
    private int tagID;

    public Drone(String name, int frequency, int tagID) {
        this.name = name;
        this.frequency = frequency;
        this.tagID = tagID;
    }
    public String getdroneName() {
        return name;
    }
    public int getdroneFreq() {
        return frequency;
    }
    public int getdroneID() {
        return tagID;
    }
    // a method to create a square for the drones on the map:
    public Square dronelocation(Point point){
        Square dronesquare = new Square(300, point, Color.BLACK);
        return dronesquare;
    }

}
