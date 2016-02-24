import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;

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
    /** indicates whether shape is being moved (or stretched?)*/
    private boolean moved;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.shapes = new ArrayList<Shape>();
        this.activeShape = null;
        this.currentColor = Color.CYAN;
        
    }

    /**
     * Returns the current drawing color
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public Color getColor()
    {
        return this.currentColor;
    }
    
    /**
     * Overrides JCompoent’s getPreferredSize method to return a size large enough to 
     * encapsulate a reasonable drawing canvas
     * 
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
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
}
