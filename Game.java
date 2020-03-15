/**
 * Formats the main frame
 * 
 * @author Blake Fox, Jacob Directo, Cooper Hornstrom
 * @finalVersion 3/11/2020
 */
public class Game
{
    public static final Board board = new Board();
    public static final Output output = new Output(board);
    public static final Rules rules = new Rules(output, board);
    /**
     * The Game class creates the main frame
     * 
     * @author Blake Fox
     * @finalVersion 3/14/2020
     */
    public static void main(String[] args)
    {
        output.buildTile(rules);
        output.arrayTo2D();
        output.update();
        output.toggleVisible();
    }
    
}