/*
 * ---------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <Eric.Slaweski@gmail.com> wrote this file. As long as you retain this notice 
 * you can do whatever you want with this stuff. If we meet some day, and you 
 * think this stuff is worth it, you can buy me a beer in return. Eric Slaweski
 * ----------------------------------------------------------------------------
 */

package tic.tac.toe;

import java.util.Random;

/**
 *
 * @author Dashie96
 */
public class Rules
{
    private boolean turn;
    private final Frame frame;
    private String winner = "Good Luck";
    
    public Rules(Frame frame)
    {
        Random ran = new Random();
        turn = ran.nextBoolean();// randomly select who goes first
        this.frame = frame;
    }
    
    public boolean check(int colum, int row)
    {
        char ch =(char)frame.getTable().getValueAt(row, colum);
        if(ch != 'x' && ch != 'o') 
        {
            return true;
        }
        return false;
    }
    
    public void pressed(int colum, int row)
    {
        if(turn)
        {
            frame.getTable().setValueAt('x', row, colum);
        }
        else
        {
            frame.getTable().setValueAt('o', row, colum);
        }
        
    }
    
    public boolean turn()
    {
        return turn;//true for human/false for ai
    }
    
    public void turnReset()
    {
        Random rand = new Random();
        turn = rand.nextBoolean();
    }
    
    public void resetWinner()
    {
        winner = "Good Luck";
    }
   
    public boolean changeTurn()
    {
        //first check if someone won!
        //top row
        if((char)frame.getTable().getValueAt(0, 0) != ' ' && 
           frame.getTable().getValueAt(0,1)==frame.getTable().getValueAt(0,0) &&
           frame.getTable().getValueAt(0,2)==frame.getTable().getValueAt(0,1))
        {
           if((char) frame.getTable().getValueAt(0, 0) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        //middle row
        if((char)frame.getTable().getValueAt(1, 0) != ' ' && 
           frame.getTable().getValueAt(1,1)==frame.getTable().getValueAt(1,0) &&
           frame.getTable().getValueAt(1,2)==frame.getTable().getValueAt(1,1))
        {
           if((char) frame.getTable().getValueAt(1, 0) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        
        //bottom row
        if((char)frame.getTable().getValueAt(2, 0) != ' ' && 
           frame.getTable().getValueAt(2,1)==frame.getTable().getValueAt(2,0) &&
           frame.getTable().getValueAt(2,2)==frame.getTable().getValueAt(2,1))
        {
           if((char) frame.getTable().getValueAt(2, 0) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        
        //first colum
        if((char)frame.getTable().getValueAt(0, 0) != ' ' && 
           frame.getTable().getValueAt(1,0)==frame.getTable().getValueAt(0,0) &&
           frame.getTable().getValueAt(2,0)==frame.getTable().getValueAt(1,0))
        {
           if((char) frame.getTable().getValueAt(0, 0) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        
        //second colum
        if((char)frame.getTable().getValueAt(0, 1) != ' ' && 
           frame.getTable().getValueAt(1,1)==frame.getTable().getValueAt(0,1) &&
           frame.getTable().getValueAt(2,1)==frame.getTable().getValueAt(1,1))
        {
           if((char) frame.getTable().getValueAt(0, 1) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        
        //third 
        if((char)frame.getTable().getValueAt(0, 2) != ' ' && 
           frame.getTable().getValueAt(1,2)==frame.getTable().getValueAt(0,2) &&
           frame.getTable().getValueAt(2,2)==frame.getTable().getValueAt(1,2))
        {
           if((char) frame.getTable().getValueAt(0, 2) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        
        //negaive slope diag
        if((char)frame.getTable().getValueAt(0, 0) != ' ' && 
           frame.getTable().getValueAt(1,1)==frame.getTable().getValueAt(0,0) &&
           frame.getTable().getValueAt(2,2)==frame.getTable().getValueAt(1,1))
        {
           if((char) frame.getTable().getValueAt(0, 0) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        
        //positive slope diag
        if((char)frame.getTable().getValueAt(0, 2) != ' ' && 
           frame.getTable().getValueAt(1,1)==frame.getTable().getValueAt(0,2) &&
           frame.getTable().getValueAt(2,0)==frame.getTable().getValueAt(1,1))
        {
           if((char) frame.getTable().getValueAt(0, 2) == 'x')
           {
               winner = "The Human won!";
               return false;
           }
           else
           {
               winner = "The AI won!";
               return false;
           }
        }
        
        turn = !turn;
        return true;
    }
   
    public String winner()
    {
        return winner;
    }
}
