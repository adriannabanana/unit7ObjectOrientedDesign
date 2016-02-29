import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

/**
 * Write a description of abstract class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private double radius;
    private Color color;

    /**
     * Default constructor for objects of class Shape
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
     * @post    center coordinates returned
     * @return    the center of the shape
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * Returns the radius
     *
     * @post    radius returned
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
     * @param   x: units the x-coordinate will be displaced; y: units the y-coordinate will be displaced
     */
    public void move(double x, double y)
    {
        double xCoordinate = this.center.getX();
        double yCoordinate = this.center.getY();
        this.center.setLocation(xCoordinate+x,yCoordinate+y);
    }

    /**
     * Sets the radius of this shape to r
     *
     * @post    r is the new radius
     * @param    radius passed in
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
     * @param   g2 is the graphics, filled is whether or not the shape will be filled or not
     */
    public abstract void draw(Graphics2D g2, boolean filled);

   
}
