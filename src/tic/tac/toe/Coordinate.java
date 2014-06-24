/*
 * ---------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <Eric.Slaweski@gmail.com> wrote this file. As long as you retain this notice 
 * you can do whatever you want with this stuff. If we meet some day, and you 
 * think this stuff is worth it, you can buy me a beer in return. Eric Slaweski
 * ----------------------------------------------------------------------------
 */

package tic.tac.toe;

/**
 *
 * @author Dashie96
 */
public class Coordinate
{
    private final int x;
    private final int y;
    public Coordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
}
