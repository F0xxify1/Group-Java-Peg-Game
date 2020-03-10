import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Board here.
 *
 * @author Jacob Directo
 * @version 3/5/2020
 */
public class Board
{
    int[] positions;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        
    }

    public void newBoard(int rows)
    {
        positions = new int[15];
        positions[0] = 0;
        for(int i = 1; i < positions.length; i++)
        {
            positions[i] = 1;
        }
    }
    
    public int[] getPositions()
    {
        return positions;
    }
}


