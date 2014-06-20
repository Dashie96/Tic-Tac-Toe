/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 20142600
 */
public class AI
{
    ArrayList<ArrayList> firstGame;//game where i move first
    ArrayList<ArrayList> secondGame;//game where i move second
    ArrayList<Coordinate> coords;//the coordinates of the Humans moves(previously)
    Random rand = new Random();

    public AI()
    {
        this.firstGame = new ArrayList<ArrayList>();
        this.secondGame = new ArrayList<ArrayList>();
        this.coords = new ArrayList<Coordinate>();
    }

    public void takeTurn(Frame frame, Rules rule, Coordinate prev)
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
}
