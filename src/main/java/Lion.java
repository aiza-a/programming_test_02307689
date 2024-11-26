import shape.Circle;

import java.awt.*;

public class Lion {
    private String name;
    private int age;
    private int tagID;

    public Lion(String name, int age, int tagID) {
        this.name = name;
        this.age = age;
        this.tagID = tagID;
    }
    public String getlionName() {
        return name;
    }
    public int getlionNumb() {
        return age;
    }
    public int getlionID() {
        return tagID;
    }
    // making a cricle to plot on the park:
    public Circle lionlocation(Point point){
        Circle lioncircle = new Circle(300, point, Color.RED);
        return lioncircle;
    }
}
