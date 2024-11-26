import shape.Circle;
import shape.Square;

import java.awt.*;
import java.util.ArrayList;
public class LocationsDrawing extends Canvas{
    ArrayList<Shape> list = new ArrayList<>();

    Keeper keeper;
    Lion lion;
    Drone drone;
    LocationSystem locationsystem = new LocationSystem();
    Point keeperpoint = new Point(locationsystem.getCoords(keeper.getKeeperID()));
    Point lionpoint = new Point(locationsystem.getCoords(lion.getlionID()));
    Point dronepoint = new Point(locationsystem.getCoords(drone.getdroneID()));

    public void Drawing(Keeper keeper, Lion lion, Drone drone){
        Circle keeper1plot = keeper.keeperlocation(keeperpoint);
        Circle lion1plot = lion.lionlocation(lionpoint);
        Square drone1plot = drone.dronelocation(dronepoint);
    }

    @override
    public void paint(Graphics g){
        for (Shape s : list){
            s.paint(g);
        }
    }
}
