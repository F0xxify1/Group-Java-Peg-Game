/**
 *Creates Board and sets and gets positions of pegs
 *
 * @author Jacob Directo, Blake Fox, Cooper Hornstrom
 * @finalVersion 3/5/2020
 */
public class Board
{
    private boolean[] positions;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        positions = new boolean[15];
        positions[0] = false;
        for(int i = 1; i < positions.length; i++)
        {
            positions[i] = true;
        }
    }

    /**
     * @param returns peg position
     */
    public boolean getPosition(int pos)
    {
        return positions[pos]; 
    }
    
    /**
     * @param sets the peg position w/ value
     */
    public void setPosition(int pos, boolean value)
    {
        positions[pos] = value;
    }
    
    public void togglePosition(int pos)
    {
        positions[pos] = !positions[pos];
    }
}

