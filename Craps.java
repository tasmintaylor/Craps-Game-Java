/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;
import java.util.Random;

/**
 *
 * @author tasmintaylor
 */
public class Craps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int round = 1;
      int wins = 0;
      int losses = 0;
      
      
      while (round < 100000){
           

            int roll = 1;
            boolean currentlyPlaying = true;
            Random randGen = new Random();
            int dice1 = randGen.nextInt(6) + 1;
            int dice2 = randGen.nextInt(6) + 1;
            int diceTotal = dice1 + dice2;
            int point = diceTotal;
            if (round<11) {
                System.out.println("Round " + round + " , Roll 1 -- Die1: " + dice1 + " , Die2: " + dice2 + " -- Total: " + diceTotal );  }        
            if (diceTotal == 7 | diceTotal == 11){
                    wins++;
            if (round<11) {       
                    System.out.println("WIN!");}
                    currentlyPlaying = false;
            }else{
                if (diceTotal == 2 | diceTotal == 3 | diceTotal == 12){
                    losses++;
                if (round<11) {
                    System.out.println("LOSE!"); }
                    currentlyPlaying = false;
                }else{
                if (round<11) { 
                    System.out.println("Point is " + point);}
                }
            }

            while (currentlyPlaying){
                        //Roll the dice and check if value zero.
                    dice1 = randGen.nextInt(6) + 1;
                    dice2 = randGen.nextInt(6) + 1;
                    diceTotal = dice1 + dice2;
                    roll++;
                    if (round<11) {
                    System.out.println("Round " + round + " , Roll "+ roll + " -- Die1: " + dice1 + " , Die2: " + dice2 + " -- Total: " + diceTotal );}
                    if (diceTotal == 7) {
                        losses++;
                        if (round<11) {
                        System.out.println("LOSE!"); }
                        break;
                    }
                    if (diceTotal == point){
                        wins++;
                        if (round<11) {
                        System.out.println("WIN!"); }
                        break;
                    }
                    roll ++;

                }
                round++;
        }
      System.out.println("Overall: " + wins + " wins, "  + losses + " losses");
      
    }
    
    
}
