/**
 *Creates Board and sets and gets positions of pegs
 *
 * @author Jacob Directo, Blake Fox, Cooper Hornstrom
 * @finalVersion 3/5/2020
 */
public class Board
{
    private boolean[] positions;
    private int startingPosition = 0;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        positions = new boolean[15];
        for(int i = 0; i < positions.length; i++)
        {
            positions[i] = true;
        }
        positions[startingPosition] = false;
    }

    /**
     * returns peg position
     * @param pos
     * position to get
     */
    public boolean getPosition(int pos)
    {
        return positions[pos]; 
    }
    
    /**
     * sets the peg position w/ value
     * @param pos 
     * position to set
     * @param value
     * value to set
     */
    public void setPosition(int pos, boolean value)
    {
        positions[pos] = value;
    }
    /**
     * creates and int for position
     * @param pos
     * position to toggle
     */
    public void togglePosition(int pos)
    {
        positions[pos] = !positions[pos];
    }
}

