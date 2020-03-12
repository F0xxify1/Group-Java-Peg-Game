import java.awt.*;
import javax.swing.*;
/**
 * Graphics handler for the Java Peg Game
 *
 * @author Blake Fox
 * @finalVersion 3/11/2020
 */
public class Output
{
    JFrame frame = new JFrame("Peg Game");
    JPanel panel = new JPanel();

    public static final int ROW = 5;
    public static final int COL = 9;

    public static final Color DEF_COLOR = Color.BLACK;
    public static final Color PEG_COLOR = Color.YELLOW;
    public static final Color PEG_PRESS = Color.GREEN;
    public static final Color CLK_COLOR = Color.WHITE;
    public static final int[] ARRAY_TO_2D = new int[]{4, 12, 14, 20, 22, 24, 28, 30, 32, 34, 36, 38, 40, 42, 44};
    private JButton[][] buttons = new JButton[COL][ROW];
    /**
     * Sets the size of the game window
     */
    public Output()
    public static final int[] ARRAY_TO_2D = new int[]{4, 12, 14, 20, 22, 24, 28, 30, 32, 34, 36, 38, 40, 42, 44};
    private JButton[][] buttons2D = new JButton[ROW][COL];
    private JButton[] buttons;

    private Board board;

    /**
     * @param sets size of board using board class
     */
    public Output(Board inBoard)
    {
        board = inBoard;
        frame.setSize(700, 700);
        frame.add(panel);
        buildTile();
        arrayTo2D();
    }

    /**
     * Changes color for buttons clicked

    /**
     * @param Creates a gridlayout for virtual buttons
     */
    public void buildTile()
    {
        int buttonNum = 0;
        panel.setLayout(new GridLayout(ROW, COL));
        for(int r = 0; r < ROW; r++)
        {
            for(int c = 0; c < COL; c++)
            {
                buttons2D[r][c] = this.getDefButton(buttonNum);
                if (!arrayTo2DContains(buttonNum)) 
                    buttons2D[r][c].setEnabled(false);
                else {
                    buttons2D[r][c].setBackground(PEG_COLOR);
                    if(buttonNum == ARRAY_TO_2D[0])
                        buttons2D[r][c].setBackground(CLK_COLOR);
                    buttons2D[r][c].setForeground(buttons2D[r][c].getBackground());
                }
                panel.add(buttons2D[r][c]);
                buttonNum ++;
            }
        }
    }

    /**
     * Sets the window to visible
     */
    public void toggleVisible()
    {
        frame.setVisible(!frame.isVisible());
    }

    /**
     * @param Changes color for the different tiles
     */
    public JButton getDefButton(int number)
    {
        JButton temp = new JButton();
        temp.setToolTipText(Integer.toString(number));
        temp.setBackground(Color.BLUE);
        temp.setForeground(temp.getBackground());
        temp.addActionListener(new TileListener(this, board));
        temp.setBorderPainted(false);
        return temp;
    }

    /**
     * Creates array of buttons
     */
    public void arrayTo2D()
    {
        int buttonNum = 0;
        JButton[] tempArray = new JButton[15];

        for(int r = 0; r < ROW; r++)
        {
            for(int c = 0; c < COL; c++)
            {
                if(Integer.parseInt(buttons2D[r][c].getToolTipText()) == ARRAY_TO_2D[buttonNum])
                {
                    tempArray[buttonNum] = buttons2D[r][c];
                    tempArray[buttonNum].setToolTipText(Integer.toString(buttonNum));
                    buttonNum ++;
                }
            }
        }
        buttons = tempArray;
    }

    /**
     * @param Creates temporary variable for the virtual array to 2D array
     */
    public boolean arrayTo2DContains(int temp){
        for (int element : ARRAY_TO_2D) {
            if (element == temp)
                return true;
        }
        return false;
    }

    /**
     * @param Sets background color for the peg positions
     */
    public void update()
    {
        for(int i = 0; i < 15; i++)
        {
            JButton temp = buttons[i];
            if (board.getPosition(i) == false){
                temp.setBackground(this.CLK_COLOR);
            }else{
                temp.setBackground(this.PEG_COLOR);
            }
            temp.setForeground(temp.getBackground());
        }
    }

}
