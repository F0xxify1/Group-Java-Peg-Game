import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Output here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Output
{
    JFrame frame = new JFrame("Peg Game");
    JPanel panel = new JPanel();
    public static final int ROW = 4;
    public static final int COL = 7;
    public static final Color DEF_COLOR = Color.WHITE;
    private JButton[][] buttons = new JButton[COL][ROW]; //Declared much earlier in the program, right after the class declaration.
    private int[] arrayTo2DConversion = new int[]{3, 9, 11, 15, 17, 19, 21, 23, 25, 27};
    
    public Output()
    {
        frame.setSize(900, 700);
        frame.add(panel);
    }
    
    public void buildTile()
    {
        
        int buttonNum = 0;
        panel.setLayout(new GridLayout(ROW, COL));
        for(int r = 0; r < ROW; r++)
        {
            for(int c = 0; c < COL; c++)
            {
                buttons[c][r] = getDefButton();
                buttons[c][r].setText(String.valueOf(buttonNum));
                panel.add(buttons[c][r]);
                buttonNum ++;
            }
        }
        this.toggleVisible();
    }
    
    public void toggleVisible()
    {
        frame.setVisible(!frame.isVisible());
    }
    
    public JButton getDefButton()
    {
        JButton temp = new JButton();
        temp.setBackground(Color.WHITE);
        temp.setForeground(Color.LIGHT_GRAY);
        temp.addActionListener(new TileListener());
        temp.setBorderPainted(false);
        return temp;
    }
    
    public Color getDefColor()
    {
        return DEF_COLOR;
    }
    
    public boolean[][] arrayTo2D(boolean[] array)
    {
        boolean[][] array2D = new boolean[ROW][COL];
        int i = 0;
        int j = 0;
        for(int r = 0; r < ROW; r++)
        {
            for(int c = 0; c < COL; c++)
            {
                if(true)
                i ++;
            }
        }
        
        
        return array2D;
    }
}
