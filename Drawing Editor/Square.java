import java.awt.geom.Point2D;
import java.awt.*;


/**
 * A square shape
 * 
 * @Adrianna Fu
 * @3/1/16
 */
public class Square extends Shape
{
    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double p, double r, Color c)
    {
        super(p,r,c);
    }

    /**
     * Returns true if the point lies inside this shape, false otherwise
     *
     * @param    coordinates of point
     * @return    true if point in shape, false otherwise
     */
    public boolean isInside(Point2D.Double point)
    {
        double x = point.getX();
        double y = point.getY();
//         if (this.contains(x,y))
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
return false;
    }
    
    /**
     * Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise.
     * 
     * @post    shape will be drawn 
     * @param   g2 is the graphics, filled is whether or not the shape will be filled or not
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        
    }

}
