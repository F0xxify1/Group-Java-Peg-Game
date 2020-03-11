/**
 * Formats the main frame
 * 
 * @author Blake Fox
 * @finalVersion 3/11/2020
 */
public class Game
{
    public static final Output output = new Output();
    public static final Rules rules = new Rules();
    public static final Board board = new Board();
    /**
     * Main method
     * Creates and formats the main frame
     */
    public static void main(String[] args)
    {
        output.buildTile();
        output.toggleVisible();
        
    }
    
}