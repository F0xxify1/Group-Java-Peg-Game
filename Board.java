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
    int[][] positions;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        
    }

    public void newBoard(int rows)
    {
        if(rows > 4)
        {
            System.out.print("invalid input");
        }
        else
        {
            for(int a = 0; a <= rows; a++)
            {
                for(int b = 0; b <= a; b++)
                {
                    positions[b][a] = 1;
                }
            }
        }
    }
    
    public int[][] getPositions()
    {
        return positions;
    }
}


