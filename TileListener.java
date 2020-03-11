import java.awt.*;
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
        
        
        
        public void actionPerformed(ActionEvent e)
        {
            JButton temp = (JButton) e.getSource();
            if (temp.getBackground() == Output.PEG_COLOR){
                temp.setBackground(Output.CLK_COLOR);
                temp.setForeground(temp.getBackground());
            }else{
                temp.setBackground(Output.PEG_COLOR);
                temp.setForeground(temp.getBackground());
            }
        }
    }