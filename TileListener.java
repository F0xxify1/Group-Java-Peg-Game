import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TileListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton temp = (JButton) e.getSource();
            if (temp.getBackground() == Color.WHITE)
                temp.setBackground(Color.YELLOW);
            else
                temp.setBackground(Color.WHITE);
        }
    }