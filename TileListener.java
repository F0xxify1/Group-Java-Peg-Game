import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TileListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton temp = (JButton) e.getSource();
            if (temp.getBackground() == Color.yellow)
                temp.setBackground(Color.BLACK);
            else
                temp.setBackground(Color.yellow);
        }
    }