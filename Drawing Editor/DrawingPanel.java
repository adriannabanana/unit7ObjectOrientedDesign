import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Graphics;

/**
 * Draws everything and responds to user interaction w/ shapes
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
    /** indicates whether shape is being moved */
    private boolean moved;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.shapes = new ArrayList<Shape>();
        this.activeShape = null;

        this.moved = false;
        this.currentColor = Color.CYAN;
        this.setBackground(Color.WHITE);
        this.addMouseListener(new MouseAndMotionListener());
        this.addMouseMotionListener(new MouseAndMotionListener());
    }

    /**
     * Returns the current drawing color
     * 
     * @post    currentColor is set to the current drawing color
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
     * @post    reasonably sized dimensions for a drawing canvas is returned
     * @return    new dimensions for the canvas
     * 
     */
    public Dimension getPreferredSize()
    {
        return new Dimension(400,525);
    }
    
    /**
     * Brings up a JColorChooser and sets the chosen color as the new drawing color
     * Leaves the drawing color unchanged if the user clicks “Cancel”
     *
     * @post    currentColor is changed to whatever the user picks
     */
    public void pickColor()
    {
        this.currentColor = JColorChooser.showDialog(null, "Color Chooser", this.currentColor);
    }

    /**
     * Adds a circle
     *
     * @post    a circle is drawn on the canvas
     */
    public void addCircle()
    {
        Circle circle = new Circle(new Point2D.Double(285,275),(75*Math.random()+1),this.currentColor);
        if (shapes.size()>0)
        {
            this.shapes.add(shapes.size()-1,circle);
        }
        else
        {
            this.shapes.add(circle);
        }
        repaint();
    }
    
    /**
     * Adds a square
     *
     * @post    a square is drawn on the canvas
     */
    public void addSquare()
    {
        Square square = new Square(new Point2D.Double(285,275),75*Math.random()+1,this.currentColor);
        
        if (shapes.size()>0)
        {
            this.shapes.add(shapes.size()-1,square);
        }
        else
        {
            this.shapes.add(square);
        }
        
        repaint();
    }
    
    /**
     * Draws all of the shapes in shapes list
     * 
     * @post    draws all shapes on canvas
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape aShape : this.shapes)
        {
            if (aShape != activeShape)
            {
                aShape.draw(g2,true);
            }
        }
        
        if (activeShape != null)
        {
            activeShape.draw(g2,!this.moved);
        }
    }
    
    public class MouseAndMotionListener implements MouseListener,MouseMotionListener
    {
        private boolean inside;
        /** 
         * Determines what the activeShape is
         */
        public void mousePressed(MouseEvent event)
        {
            inside = false;
            for (Shape aShape : shapes)
            {
                if (aShape.isInside(new Point2D.Double(event.getX(),event.getY())))
                {
                    activeShape = aShape;
                    inside = true;
                }
            }
            
            if (inside == false)
            {
                activeShape = null;
                moved = false;
            }
            repaint();
        }
        
        /**
         * Moves the activeShape to wherever the user drags it
         */
        public void mouseDragged(MouseEvent event)
        {
            moved = true;
            double xCoord = event.getX(); 
            double yCoord = event.getY();
            activeShape.move(xCoord,yCoord);
            repaint();
        }
        
        /**
         * Updates the state of the activeShape
         */
        public void mouseReleased(MouseEvent event)
        {
             moved = false;
             activeShape = null;
             repaint();
        }
        
        public void mouseClicked(MouseEvent event)
        {   
        }
        public void mouseEntered(MouseEvent event) 
        {
        }
        public void mouseExited(MouseEvent event)
        {
        }
        public void mouseMoved(MouseEvent event)
        {
        }
    }

}

