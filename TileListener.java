import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TileListener implements ActionListener
    {
        
        public TileListener()
        {
            
        }
        
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