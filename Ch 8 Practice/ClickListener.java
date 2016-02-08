import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener

{
    private int count;
    
    public void actionPerformed(ActionEvent event)
    {
        count++;
        if (count == 1)
        {
            System.out.println("I was clicked 1 time!");
        }
        else
        {
            System.out.println("I was clicked " + count + "times!");
        }
    }
}
    