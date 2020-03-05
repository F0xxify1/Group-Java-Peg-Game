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
    int[][] board;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
    }
    
    public void newBoard(int rows)
    {
       board = new int[rows + 2][rows + 2];
       
        if(rows < 5)
       {
         System.out.print("invalid input");
       }
       else
       {
          for(int a = 1; a <= rows; a++)
          {
             for(int b = 1; b <= a; b++)
             {
               board[b][a] = 1;
             }
          }
       }
    }
    
}