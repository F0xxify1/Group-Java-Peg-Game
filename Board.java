import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Board here.
 *
 * @author Fox
 * @version 0.01A
 */
public class Board
{

    boolean[] pegPositions = new boolean[15]; 
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
    }

    public void setPosition(int position)
    {
        for(int i = 0; i<pegPositions.length; i++)
        {
            if(pegPositions.length==15)
            {
                position = pegPositions.length;
            }
        }
    }

    public int getPosition(int position)
    {
        return position; 
    }
}

