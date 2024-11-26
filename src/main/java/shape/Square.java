package shape;

import java.awt.*;
public class Square extends Shapes{
    private int edge;
    private Color color;
    private Point point;
    //private String label;

    public Square(int edge, Point point, Color color) {
        super();
        this.edge = edge;
        this.color = color;
        this.point = point;
        //this.label = label;
    }

    public void paint (Graphics g) {
        g.setColor(color);
        //claculate the top-left corner based on centre position:
        int topleftx = point.x - edge/2;
        int toplefty = point.y - edge/2;
        g.fillRect(topleftx,toplefty, edge, edge);
        //g.drawString(label, topleftx-2, toplefty-2);
    }
}
