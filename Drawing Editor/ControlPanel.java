import javax.swing.JPanel;
import javax.swing.JButton;

/**
 * Write a description of class ControlPanel here.
 * 
 * @Adrianna Fu
 * @2.23.16
 */
public class ControlPanel extends JPanel
{
    /** a button that calls canvas' pickColor method */
    private JButton pickColor;
    /** a button that adds a circle to the canvas when pressed */
    private JButton addCircle;
    /** a button that adds a square to the canvas when pressed */
    private JButton addSquare;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add square");
        
        this.add(this.pickColor);
        this.add(this.addCircle);
        this.add(this.addSquare);
    }

    
}
