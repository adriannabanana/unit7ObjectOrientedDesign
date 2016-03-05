import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * A circle shape
 * 
 * @author Adrianna Fu
 * @version 3.1.16
 */
public class Circle extends Shape
{
    /** the current color */
    private Color fillColor;
    
    /**
     * Initializes a new instance of the Circle class
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
        this.fillColor = color;
    }

    /**
     * Returns true if the point lies inside this shape, false otherwise
     *
     * @param    coordinates of point
     * @return    true if point in shape, false otherwise
     */
    public boolean isInside(Point2D.Double point)
    {
        Point2D.Double center = super.getCenter();
        double x = center.getX();
        double y = center.getY();
        double radius = super.getRadius();
        double length = radius*2;
        
        Ellipse2D.Double circle = new Ellipse2D.Double(x-radius,y-radius,length,length);
        
        if (circle.contains(point.getX(),point.getY()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Draws a hollow or filled circle
     * 
     * @post    a circle will be drawn
     * @param   g2 Graphics2D 
     * @param   filled  whether or not the shape will be filled
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        Point2D.Double center = super.getCenter();
        double x = center.getX();
        double y = center.getY();
        double radius = super.getRadius();
        double length = radius*2;
        
        Ellipse2D.Double circle = new Ellipse2D.Double(x-radius,y-radius,length,length);
        
        g2.setColor(fillColor);
        g2.draw(circle);
        if (filled)
        {
            g2.fill(circle);
        }
    }
}
