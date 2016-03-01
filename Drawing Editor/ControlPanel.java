import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
    /** the control panel */
    private DrawingPanel control;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.control = canvas;
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add square");
        
        this.add(this.pickColor);
        this.add(this.addCircle);
        this.add(this.addSquare);
        
        ClickListener listener = new ClickListener();
        this.pickColor.addActionListener(listener);
        this.addCircle.addActionListener(listener);
        this.addSquare.addActionListener(listener);
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand()=="pickColor") 
            {
                control.pickColor();
            }
            if (event.getActionCommand()=="addCircle")
            {
                control.addCircle();
            }
            if (event.getActionCommand()=="addSquare")
            {
                control.addSquare();
            }
        }
    }
}
