import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

/**
 * A shape 
 * 
 * @author Adrianna Fu
 * @version 3.1.16
 */
public abstract class Shape
{
    /** the center coordinates */
    private Point2D.Double center;
    /** the length of the radius */
    private double radius;
    /** the color of the shape */
    private Color color;

    /**
     * Initializes a new instance of the Shape class
     */
    public Shape(Point2D.Double center, double radius, Color color)
    {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    /**
     * Returns the center of the shape
     *
     * @return    the center coordinates of the shape
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * Returns the radius
     *
     * @return    radius
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * Displaces the center of this shape by (x, y).
     *
     * @post    shape displaced by (x,y)
     * @param   x units the x-coordinate will be displaced
     * @param   y units the y-coordinate will be displaced
     */
    public void move(double x, double y)
    {
        this.center = new Point2D.Double(x,y);
    }

    /**
     * Sets the radius of this shape to r
     *
     * @post    radius of shape is set to r
     * @param    r radius that is passed in  
     */
    public void setRadius(double r)  
    {
        this.radius = r;
    }
    
    /**
     * Returns true if the point lies inside this shape, false otherwise
     *
     * @param    coordinates of point
     * @return    true if point in shape, false otherwise
     */
    public abstract boolean isInside(Point2D.Double point);
    
    /**
     * Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise.
     * 
     * @post    shape will be drawn 
     * @param   g2 Graphics2D 
     * @param   filled  whether or not the shape will be filled
     */
    public abstract void draw(Graphics2D g2, boolean filled);
}
