import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;


/**
 * A program that allows the user to specify a triangle with three mouse presses.
 * After the first mouse press, draw a small dot. 
 * After the second mouse press, draw a line joining the first two points. 
 * After the third mouse press, draw the entire triangle.
 * The fourth mouse press erases the old triangle and starts a new one.
 */
public class TriangleViewer  extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    
    private JFrame frame;
    private JPanel panel;
    
    private TriangleComponent scene;

    
    public TriangleViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.frame.add(this.panel);
        this.frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        
    }
    
    
    
}
