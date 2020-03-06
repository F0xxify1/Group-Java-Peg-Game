
public class Rules
{
    String winner;

    public Rules()
    {
    }

    public boolean isWinner()
    {
        boolean winner = false;

    }

    public void makeMove(int fromROW, int fromCOL, int toROW, int toCOL)
    {
        //Change fromROW or fromCOL to fromRow and fromCol for easier typing
        String EMPTY= null;
        board[toROW][toCOL]=board[fromROW][fromCOL];
        board[fromROW][toCOL]=EMPTY;
        if(fromROW-toROW==2 || fromROW-toROW==-2)
        {
            int jumpROW=(fromROW+toROW)/2;
            int jumpCOL=(fromCOL+toCOL)/2;
            board[jumpROW][jumpCOL]=EMPTY;
            
        }
    }
    public boolean canMakeMove(int fromROW, int fromCOL, int toROW, int toCOL)
    {
        if(fromROW-toROW>2||fromROW-toROW>-2)
        {
         return false;   
        }
    }
}