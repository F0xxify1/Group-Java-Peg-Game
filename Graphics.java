import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Graphics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Graphics
{
    JPanel panelc = new JPanel();
    private JButton[][] t = new JButton[9][9]; //Declared much earlier in the program, right after the class declaration.
    
    public Graphics()
    {
        
    }
    
    public void buildTile()
    {
        panelc.setLayout(new GridLayout(9, 9));
        for(int r = 0; r < 9; r++)
        {
            for(int c = 0; c < 9; c++)
            {
                t[r][c] = new JButton("O");
                t[r][c].setBackground(Color.BLACK);
                t[r][c].setForeground(Color.WHITE);
                t[r][c].addActionListener(new TileListener());
                panelc.add(t[r][c]);
            }
        }
    }
    
}
