package shape;

import java.awt.*;

public class Shapes {
    protected Point position;
    protected Color colour;

    public Shapes(Point position, Color colour) {
        this.position = position;         // Initialize position
        this.colour = colour;                // Initialize color
    }

    // public abstract void draw(Graphics g);
}