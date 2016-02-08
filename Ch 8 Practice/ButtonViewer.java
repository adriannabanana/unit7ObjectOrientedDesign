import java.swing.JFrame;
import java.JButton;
import java.awt.event.ActionListener;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        ClickListener listener = new ClickListener();
        Button.addActionListner(listener);
        
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       
        
    }
    
    
}