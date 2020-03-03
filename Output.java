import java.awt.*;
import java.util.Arrays;
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
    public static final int ROW = 5;
    public static final int COL = 9;
    public static final Color DEF_COLOR = Color.WHITE;
    public static final int[] ARRAY_TO_2D = new int[]{4, 12, 14, 20, 22, 24, 28, 30, 32, 34, 36, 38, 40, 42, 44};
    public static final int NULL_BUTTON_VALUE = 0;
    private JButton[][] buttons = new JButton[COL][ROW];
    
    public Output()
    {
        frame.setSize(700, 700);
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
                if(!Arrays.asList(ARRAY_TO_2D).contains(buttonNum))
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
    
    public int GetNullButtonValue()
    {
        return NULL_BUTTON_VALUE;
    }
}
