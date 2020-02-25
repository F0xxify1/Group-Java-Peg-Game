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
    JFrame frame = new JFrame("Peg Game");
    private JButton[][] t = new JButton[9][9]; //Declared much earlier in the program, right after the class declaration.
    
    public Graphics()
    {
        frame.setSize(900, 700);
    }
    
    public void buildTile()
    {
        int row = 4;
        int col = 7;
        frame.setLayout(new GridLayout(row, col));
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < col; c++)
            {
                t[c][r] = new JButton("");
                t[c][r].setBackground(Color.BLACK);
                t[c][r].setForeground(Color.WHITE);
                t[c][r].addActionListener(new TileListener());
                t[c][r].setBorderPainted(false);
                frame.add(t[c][r]);
            }
        }
        toggleVisible();
    }
    
    public void toggleVisible()
    {
        frame.setVisible(!frame.isVisible());
    }
    
}
