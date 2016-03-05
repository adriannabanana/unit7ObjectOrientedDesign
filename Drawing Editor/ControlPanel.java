import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Shape buttons and color chooser on the canvas
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
    /** the current drawing color */
    private JPanel currentColor;
    
    /**
     * Initializes a new instance of the ControlPanel class
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.control = canvas;
        this.currentColor = new JPanel();
        this.currentColor.setBackground(control.getColor());
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        this.add(this.pickColor);
        this.add(this.currentColor);
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
            if (event.getActionCommand()=="Pick Color") 
            {
                control.pickColor();
                currentColor.setBackground(control.getColor());
            }
            else if (event.getActionCommand()=="Add Circle")
            {
                control.addCircle();
            }
            else if (event.getActionCommand()=="Add Square")
            {
                control.addSquare();
            }
            control.repaint();
        }
    }
}
