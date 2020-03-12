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
<<<<<<< HEAD

    /**
     * @param returns peg position
     */
    public int getPosition(int pos)
=======
    
    public boolean getPosition(int pos)
>>>>>>> 062a303d131c3ed90fa6e83e96e212295a861fb3
    {
        return positions[pos]; 
    }
<<<<<<< HEAD
    /**
     * @param sets the peg position w/ value
     */
    public void setPosition(int pos, int value)
=======
    
    public void setPosition(int pos, boolean value)
>>>>>>> 062a303d131c3ed90fa6e83e96e212295a861fb3
    {
        positions[pos] = value;
    }
    
    public void togglePosition(int pos)
    {
        positions[pos] = !positions[pos];
    }
}

