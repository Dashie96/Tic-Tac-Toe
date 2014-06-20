/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.util.Random;

/**
 *
 * @author 20142600
 */
public class AI
{

    Random rand = new Random();

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
