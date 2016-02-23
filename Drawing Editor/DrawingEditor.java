import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;


/**
 * Attaches canvas and controls to JFrame’s content pane
 * 
 * @Adrianna Fu 
 * @2.23.16
 */
public class DrawingEditor extends JFrame
{
    /** set width of frame */
    private static final int FRAME_WIDTH = 600;
    /** set height of frame */
    private static final int FRAME_HEIGHT = 600;
    /** the canvas where shapes will be drawn on */
    private DrawingPanel canvas;
    /** the control panel of buttons */
    private ControlPanel controls;
    /** panel for canvas and controls to be added to frame */
    private JPanel panel;

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        this.panel = new JPanel();
        this.panel.add(canvas);
        this.panel.add(controls);
        this.add(this.panel);
        
        this.setTitle("Drawing Editor");
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Creates a new DrawingEditor object which opens a window on the screen.
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void sampleMethod(int y)
    {
        // put your code here

    }

}
