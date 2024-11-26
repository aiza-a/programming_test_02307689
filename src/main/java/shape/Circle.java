package shape;

import java.awt.*;

public class Circle extends Shapes{
    private int radius;
    private Point center;
    private Color color;

    public Circle(int radius, Point center, Color color) {
        super();
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    public void paint (Graphics g) {
        g.setColor(color);
        g.fillOval(center.x - radius/2, center.y -radius/2, radius, radius );
    }
}
