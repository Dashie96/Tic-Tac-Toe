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
import java.util.Random;

/**
 *
 * @author Dashie96
 */
public class AI
{

    ArrayList<Game> games;//games i have won (resets when closed.)
    Game game;
    Random rand = new Random();

    public AI()
    {
        games = new ArrayList<>();
    }

    public void takeTurn(Frame frame, Rules rule, Coordinate prev)
    {
        this.game.addCoords(prev);
        boolean foundWin = false;
        if (!rule.turn()) {
            for (Game game : games) {
                for (int i = 0; game.getCoords().get(i) == this.game.getCoords().get(i); i++) {
                    if (this.game.getTurns() == i) {
                        Coordinate chord;//use this to win
                        chord = (Coordinate) game.getCoords().get(this.game.getTurns());
                        if (rule.check(chord.getX(), chord.getY())) {
                            rule.pressed(chord.getX(), chord.getY());
                            rule.changeTurn();
                            this.game.addCoords(chord);
                            foundWin = true;    
                        }
                        break;
                    }
                }
            }

            if (!foundWin) {
                int row = rand.nextInt(3);
                int colum = rand.nextInt(3);
                if (rule.check(colum, row)) {
                    rule.pressed(colum, row);
                    this.game.addCoords(new Coordinate(colum, row));
                    rule.changeTurn();
                }
                else {
                    takeTurn(frame, rule);
                }
            }
        }
    }

    public void takeTurn(Frame frame, Rules rule)
    {
        if (!rule.turn()) {
            int row = rand.nextInt(3);
            int colum = rand.nextInt(3);
            if (rule.check(colum, row)) {
                rule.pressed(colum, row);
                rule.changeTurn();
            }
            else {
                takeTurn(frame, rule);
            }
        }
    }

    public void firstTurn()
    {
        game = new Game(true);
    }

    public void secondTurn()
    {
        game = new Game(false);
    }

    public void reset()
    {
        //stores the previous game into the array
        this.games.add(this.game);
        //if we lost the game will be reset
    }
}
