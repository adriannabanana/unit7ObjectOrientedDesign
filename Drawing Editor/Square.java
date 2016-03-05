import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics2D;


/**
 * A square shape
 * 
 * @Adrianna Fu
 * @3/1/16
 */
public class Square extends Shape
{
    /** the current color */
    private Color fillColor;
    
    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double halfLength, Color color)
    {
        super(center,halfLength,color);
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
        double halfLength = super.getRadius();
        double length = halfLength*2;
        
        Rectangle2D.Double square = new Rectangle2D.Double(x-halfLength,y-halfLength,length,length);
        
        if (square.contains(point.getX(),point.getY()))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    
    /**
     * Draws a hollow or filled square
     * 
     * @post    shape will be drawn 
     * @param   g2 is the graphics, filled is whether or not the shape will be filled or not
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        Point2D.Double center = super.getCenter();
        double x = center.getX();
        double y = center.getY();
        double halfLength = super.getRadius();
        double length = halfLength*2;
        
        Rectangle2D.Double square = new Rectangle2D.Double(x-halfLength,y-halfLength,length,length);
        
        if (filled)
        {
            g2.setColor(fillColor);
            g2.fill(square);
        }
        else
        {
            g2.draw(square);
        }
    }

}
