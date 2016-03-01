import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @Adrianna Fu
 * @2.24.16
 */
public class DrawingPanel extends JPanel
{
    /** list of shapes */
    private ArrayList<Shape> shapes;
    /** last added shape or the shape last picked with a mouse */
    private Shape activeShape;
    /** current drawing color */
    private Color currentColor;
    /** indicates whether a shape is currently picked on */
    private boolean picked;
    /** indicates whether shape is being moved (or stretched)*/
    private boolean moved;
    /** background color */
    private Color backgroundColor;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.shapes = new ArrayList<Shape>();
        this.activeShape = null;
        this.currentColor = Color.CYAN;
        this.backgroundColor = Color.WHITE;
        
    }

    /**
     * Returns the current drawing color
     * 
     * @return    returns the current drawing color
     */
    public Color getColor()
    {
        return this.currentColor;
    }
    
    /**
     * Overrides JCompoent’s getPreferredSize method to return a size large enough to 
     * encapsulate a reasonable drawing canvas
     * 
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public Dimension getPreferredSize()
    {
        return new Dimension(400,400);
    }
    
    /**
     * Brings up a JColorChooser and sets the chosen color as the new drawing color
     * Leaves the drawing color unchanged if the user clicks “Cancel”
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void pickColor()
    {
        JColorChooser.showDialog(null, "Color Chooser", this.currentColor);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void addCircle()
    {
        Circle circle = new Circle(new Point2D.Double(200,200),(50*Math.random()+1),this.currentColor);
        circle.draw(g2, this.moved);
        this.picked = true;
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void addSquare()
    {
        
    }
    
//     public class MouseClickListener implements MouseListener
//     {
//         public void mouseClicked(MouseEvent event)
//         {
//             setPoint(event.getX(),event.getY());
//         }
//         
//         public void mouseReleased(MouseEvent event)
//         {
//         }
//         
//         public void mouseEntered(MouseEvent event) 
//         {
//         }
//         
//         public void mouseExited(MouseEvent event)
//         {
//         }
//     }
}

