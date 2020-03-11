/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static final Output output = new Output();
    public static final Rules rules = new Rules();
    public static final Board board = new Board();
    public static void main(String[] args)
    {
        output.buildTile();
        output.toggleVisible();
        
    }
    
}