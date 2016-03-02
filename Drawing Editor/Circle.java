import java.awt.geom.Point2D;
import java.awt.*;
import java.awt.geom.Ellipse2D;


/**
 * A circle shape
 * 
 * @Adrianna Fu
 * @3/1/16
 */
public class Circle extends Shape
{
    /**
     * Default constructor for objects of class Square
     */
    public Circle(Point2D.Double center, double r, Color c)
    {
        super(center,r,c);
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
        
        Point2D.Double center = super.getCenter();
        double centerX = center.getX();
        double centerY = center.getY();
        
        Ellipse2D.Double circle = new Ellipse2D.Double(centerX,centerY,super.getRadius(),super.getRadius());
        if (circle.contains(x,y))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise.
     * 
     * @post    shape will be drawn 
     * @param   g2 is the graphics, filled is whether or not the shape will be filled or not
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        Point2D.Double center = super.getCenter();
        double centerX = center.getX();
        double centerY = center.getY();
        
        Ellipse2D.Double circle = new Ellipse2D.Double(centerX,centerY,super.getRadius(),super.getRadius());
        if (filled)
        {
            g2.fill(circle);
        }
        else
        {
            //g2.draw(30,30,30,30);
        }
    }

}
