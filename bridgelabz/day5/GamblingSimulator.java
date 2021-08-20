/**
 * **************************************************************************************
 * Purpose:Write a Program GamlingSimulator.java where a gambler starts with certain stake
 * in INR and places fair Re 1 bet until he/she goes broke or reaches the goal set as
 * input. Keeps track of the number of times won and number of bets made. Run the
 * simulation N times.
 * Input - stake, goal and trails are taken as input
 * Output - Number of times won, Percent Win and Avg number of bets made.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 18-07-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day5;

import java.util.Scanner;

public class GamblingSimulator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stake : ");
        int Stake = sc.nextInt();
        System.out.println("Enter Goal : ");
        int Goal = sc.nextInt();
        System.out.println("Enter Number of Times : ");
        int NoOfTime = sc.nextInt();

        int bets = 0;
        int wins = 0;

        for (int i=0;i<NoOfTime;i++){
            int cash = Stake;

            while (cash > 0 && cash < Goal){
                bets++;

                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            if (cash == Goal)
                wins++;
        }
        System.out.println(wins + " wins of " + NoOfTime);
        System.out.println("Percent of games won = " + 100.0 * wins / NoOfTime);
        System.out.println("Avg Number of bets  = " + 1.0 * bets / NoOfTime);
    }

}
