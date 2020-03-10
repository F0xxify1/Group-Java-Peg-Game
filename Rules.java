
public class Rules
{
    private static boolean[] pegsPresent = new boolean[15];
    private static String    blanks      = " ";
    /* {"from", "to", "jumped"} */
    private static int jumpTable[][] = { {1,4,2}, {1,6,3}, {2,7,4}, {2,9,5},
    {3,8,5},  {3,10,6}, {4,6,5}, {4,1,2}, {4,11,7}, {4,13,8},
    {5,14,9}, {5,12,8}, {6,4,5}, {6,13,9}, {6,15,10}, {6,1,3}, 
    {7,2,4}, {7,9,8}, {8,3,5}, {8,10,9},
    {9,2,5}, {9,7,8}, {10,8,9}, {10,3,6},
    {11,13,12}, {11,4,7}, {12,5,8}, {12,14,13},
    {13,11,12}, {13,15,14}, {13,6,9}, {13,4,8},
    {14,12,13}, {14,5,9}, {15,13,14}, {15,6,10} };
    
    String winner;
    private Board board;
    int[][] pos;
    public Rules(Board inBoard)
    {
        board = inBoard;
        pos = board.getPositions();
    }  
    
    public boolean canMove(int fromRow, int fromCol, int toRow, int toCol)
    {
        
        if(fromRow - toRow == 2 || fromRow - toRow == -2)
        {
            if(fromCol - toCol == 2 || fromCol - toCol == -2)
            {
                int jumpRow = (fromRow + toRow) / 2;
                int jumpCol = (fromCol + toCol) / 2;
                pos[jumpRow][jumpCol] = 0;
                return true;
            }
        } else if(fromCol - toCol == 2 || fromCol - toCol == -2)
        {
            if(fromRow == toRow)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public void makeMove(int fromRow, int fromCol, int toRow, int toCol)
    {
        if (canMove(fromRow, fromCol, toRow, toCol) == true)
        {
            pos[toRow][toCol] = pos[fromRow][fromCol];
            pos[fromRow][toCol] = 0;
            
        }
    }
    
    public boolean isWinner()
    {
        boolean winner = false;
        int j;
        for(int i = 0; i < 5; i++)
        {
            if(canMove(1,1,1,1) == false)
            {
                
            }
        }
        return true;

    }
}