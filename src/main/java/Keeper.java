import shape.Circle;

import java.awt.*;

public class Keeper {
    private String name;
    private int number;
    private int tagID;

    public Keeper(String name, int number, int tagID) {
        this.name = name;
        this.number = number;
        this.tagID = tagID;
    }
    public String getKepperName() {
        return name;
    }
    public int getKeeperNumb() {
        return number;
    }
    public int getKeeperID() {
        return tagID;
    }
    // a method to create a circle for the keepers on the map:
    public Circle keeperlocation(Point point){
        Circle keepercircle = new Circle(200, point, Color.BLUE);
        return keepercircle;
    }
}
