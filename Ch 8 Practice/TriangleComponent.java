import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * A program that allows the user to specify a triangle with three mouse presses.
 * After the first mouse press, draw a small dot. 
 * After the second mouse press, draw a line joining the first two points. 
 * After the third mouse press, draw the entire triangle.
 * The fourth mouse press erases the old triangle and starts a new one.
 */
public class TriangleComponent extends JComponent 
{
    public void drawPoint(Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        //g2.draw(new Point2D.Double(x, y));
    }
    
    public void drawLine(Graphics g, int x1, int y1, int x2, int y2)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Line2D.Double(x1, y1, x2, y2));

    }
}
