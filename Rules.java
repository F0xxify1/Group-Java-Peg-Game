
public class Rules
{
    String winner;
    
    public Rules()
    {
    }  
    public void makeMove(int fromRow, int fromCol, int toRow, int toCol)
    {
        String EMPTY= null;
        Board board = new Board();
        board[toRow][toCol]=board[fromRow][fromCol];
        board[fromRow][toCol]=EMPTY;
        if(fromRow-toRow==2 || fromRow-toRow==-2)
        {
            int jumpRow=(fromRow+toRow)/2;
            int jumpCol=(fromCol+toCol)/2;
            board[jumpRow][jumpCol]=EMPTY;

        }
    }

    public boolean canMakeMove(int fromRow, int fromCol, int toRow, int toCol)
    {
        if(fromRow-toRow>2||fromRow-toRow>-2)
        {
            return false;   
        }
    }
    public boolean isWinner()
    {
        boolean winner = false;
        int j;
        for(int i=0; i<5; i++)
        {
            if(canMakeMove() == false)
            {
                int count;
                count++;
            }
        }


    }
}