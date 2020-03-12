import java.awt.event.*;
import javax.swing.*;
/**
 * Sets color for graphics
 * 
 * @author Blake Fox
 * @finalVersion 3/11/2020
 */
public class TileListener implements ActionListener
    {
        private Output output;
        private Board board;
        
        public TileListener(Output inOutput, Board inBoard)
        {
            output = inOutput;
            board = inBoard;
        }
        
        public void actionPerformed(ActionEvent e)
        {
            JButton temp = (JButton) e.getSource();
            int i = Integer.parseInt(temp.getToolTipText());
            if(board.getPosition(i) == true)
            {
                temp.setBackground(output.PEG_PRESS);
            }
            System.out.println(i);
            Game.rules.addStroke(i);
            output.update();
        }
        
    }