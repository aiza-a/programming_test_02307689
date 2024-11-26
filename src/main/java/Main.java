import shape.Circle;
import shape.Square;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Keeper keeper1 = new Keeper("Geoff", 4392, 80);
        Lion lion1 = new Lion("Simba", 7, 30);
        Drone drone1 = new Drone("Monitor1", 128, 124);

        //get point coordinates from the location systems file using GPS ID of each item:
        LocationSystem locationsystem = new LocationSystem();
        Point keeperpoint = new Point(locationsystem.getCoords(keeper1.getKeeperID()));
        Point lionpoint = new Point(locationsystem.getCoords(lion1.getlionID()));
        Point dronepoint = new Point(locationsystem.getCoords(drone1.getdroneID()));

        //plot the respective shapes for each item:
        Circle keeper1plot = keeper1.keeperlocation(keeperpoint);
        Circle lion1plot = lion1.lionlocation(lionpoint);
        Square drone1plot = drone1.dronelocation(dronepoint);

        Canvas plots = new Canvas();

        plots.setSize(600, 600);
        plots.setBackground(Color.lightGray);
        plots.add(keeper1plot);
        plots.add(lion1plot);
        plots.add(drone1plot);
        plots.setVisible(true);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.add(plots);
        //frame.add(keeper1plot)
        //frame.add(keeper2plot)
        //frame.add(keeper3plot)
    }
}