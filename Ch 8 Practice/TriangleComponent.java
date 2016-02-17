import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.event.*;

import javax.swing.JFrame;

/**
 * A program that allows the user to specify a triangle with three mouse presses.
 * After the first mouse press, draw a small dot. 
 * After the second mouse press, draw a line joining the first two points. 
 * After the third mouse press, draw the entire triangle.
 * The fourth mouse press erases the old triangle and starts a new one.
 */
public class TriangleComponent extends JComponent 
{
    private int clickNum = 0;
    private Ellipse2D point;
    private Line2D line1;
    private Line2D line2;
    private Line2D line3;
    
    public TriangleComponent()
    {
        
    }
    
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);        
    }
       
    public void drawPoint(int x, int y)
    {        

    }

    public void drawLine(int x1, int y1, int x2, int y2)
    {
        if (this.clickNum == 2)
        {
            this.line2.setLine(x1,y1,x2,y2); 
        }

    }

    public class MousePressListener implements MouseListener
    {
        public void mouseReleased(MouseEvent event)
        {
        }
        public void mouseClicked(MouseEvent event)
        {
            if (this.clickNum = 1)
            {
                drawPoint(event.getX(), event.getY());
            }
        }
        public void mouseEntered(MouseEvent event) 
        {
        }
        public void mouseExited(MouseEvent event)
        {
        }
    }

}
