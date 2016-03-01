import java.awt.geom.Point2D;
import java.awt.Graphics2D;


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
    public Square()
    {
        super();
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
    }
    
    /**
     * Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise.
     * 
     * @post    shape will be drawn 
     * @param   g2 is the graphics, filled is whether or not the shape will be filled or not
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        if (filled)
        {
            g2.fillRect(30,30,30,30);
        }
        else
        {
            g2.drawRect(30,30,30,30);
        }
    }

}
