/*
 * ---------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <Eric.Slaweski@gmail.com> wrote this file. As long as you retain this notice 
 * you can do whatever you want with this stuff. If we meet some day, and you 
 * think this stuff is worth it, you can buy me a beer in return. Eric Slaweski
 * ----------------------------------------------------------------------------
 */

package tic.tac.toe;

import java.util.ArrayList;

/**
 * This class should hold a whole games worth of information. who started the game, current turn, and the moves of each player.
 * @author Dashie96
 */
public class Game
{
    boolean started; //who started the game, true for AI false for Human
    ArrayList<Coordinate> coords;//the coordinates of the Humans moves(previously)
    int turnNumb;//0 for new game -1 for finished game 8 MAX.
    
    
    public Game(boolean started)
    {
        this.started = started;
        this.coords = new ArrayList<>();
        turnNumb = 0;
    }
    
    
    public void addCoords(Coordinate coords)
    {
        this.coords.add(coords);
    }
    
    public void addTurns()
    {
        turnNumb++;
    }
    
    
    public boolean getStarted()//lol
    {
        return started;
    }
    
    public ArrayList getCoords()
    {
     return coords;   
    }
    
    public int getTurns()
    {
        return turnNumb;
    }
}
