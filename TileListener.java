import java.awt.event.*;
import javax.swing.*;
/**
 * Sets color for graphics
 * 
 * @author Blake Fox
 * @finalVersion 3/11/2020
 * 
 */
public class TileListener implements ActionListener
{   
    private Output output;
    private Board board;
    private Rules rules;
    
    /**
     * Default TileListener for each button
     * @param Output output object
     * @param Board board object
     * @param Rules rules object
     */
    public TileListener(Output inOutput, Board inBoard, Rules inRules)
    {
        output = inOutput;
        board = inBoard;
        rules = inRules;
    }

    /**
     * Runs each time a button is pressed
     * @param event that occurred
     */
    public void actionPerformed(ActionEvent e)
    {
        JButton temp = (JButton) e.getSource();
        int i = Integer.parseInt(temp.getToolTipText());
        rules.addStroke(i);
        output.update();
    }
}
