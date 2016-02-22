import javax.swing.JFrame;

/**
 * A program that allows the user to specify a triangle with three mouse presses.
 * After the first mouse press, draw a small dot. 
 * After the second mouse press, draw a line joining the first two points. 
 * After the third mouse press, draw the entire triangle.
 * The fourth mouse press erases the old triangle and starts a new one.
 */
public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;

    private TriangleComponent component;

    public TriangleFrame()
    {
        this.component = new TriangleComponent();
        this.add(component);
        
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setTitle("Triangle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
}
