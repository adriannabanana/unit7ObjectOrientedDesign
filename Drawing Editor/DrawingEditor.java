import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * Attaches canvas and controls to JFrame’s content pane
 * 
 * @author Adrianna Fu 
 * @version 2.23.16
 */
public class DrawingEditor extends JFrame
{
    /** width of frame */
    private static final int FRAME_WIDTH = 600;
    /** height of frame */
    private static final int FRAME_HEIGHT = 600;
    /** where shapes will be drawn */
    private DrawingPanel canvas;
    /** the control panel of buttons */
    private ControlPanel controls;
    /** panel for canvas and controls to be added to frame */
    private JPanel panel;

    /**
     * Initializes a new instance of the DrawingEditor class
     */
    public DrawingEditor()
    {
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(this.canvas);
        this.setLayout(new BorderLayout());
        this.add(this.controls, BorderLayout.SOUTH);
        this.add(this.canvas, BorderLayout.NORTH);
        
        this.setTitle("Drawing Editor");
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Creates a new DrawingEditor object which opens a window on the screen
     */
    public static void main(String args[])
    {
        DrawingEditor newWindow = new DrawingEditor();
    }
}
