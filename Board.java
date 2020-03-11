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
    private int[] positions;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        positions = new int[15];
        positions[0] = 0;
        for(int i = 1; i < positions.length; i++)
        {
            positions[i] = 1;
        }
    }

    public int getPosition(int pos)
    {
        return positions[pos];
    }

    public void setPosition(int pos, int value)
    {
        positions[pos] = value;
    }
}

