import java.awt.event.*;
import javax.swing.*;
/**
 * Sets color for graphics
 * 
 * @author Blake Fox
 * @finalVersion 3/11/2020
 * 
 * Should it be calling Game.rules? It is static in the Game class... or should it be passed in as a param?
 */
public class TileListener implements ActionListener
{   
    private Output output;
    private Board board;
    private Rules rules;

    public TileListener(Output inOutput, Board inBoard, Rules inRules)
    {
        output = inOutput;
        board = inBoard;
        rules = inRules;
    }

    /**
     * @param ActionEvent passes in the action
     */
    public void actionPerformed(ActionEvent e)
    {
        JButton temp = (JButton) e.getSource();
        int i = Integer.parseInt(temp.getToolTipText());
        if(board.getPosition(i) == true)
        {
            temp.setBackground(output.PEG_PRESS);
        }
        System.out.println(i);
        rules.addStroke(i);
        output.update();
    }
}
