/**
 * **************************************************************************************
 * Purpose:Code to to play a Cross Game or Tic-Tac-Toe Game.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 02-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day18;

import com.bridgelabz.day18.util.Utility;

public class TicTacToe {
	public static void main(String[] args) 
	{
		System.out.println("Start the game..!");	
		System.out.println("Welcome to the TicTacToe Game");
		System.out.println("-----------------------------");
		System.out.println("player 1 will be the computer and it's Symbol is : 0");
		System.out.println("Enter the Name of the player 2");
		
		// variable name holds the name of the player2
		String name=Utility.getLine();
		//Calling method to play TicTacTeo game
		Utility.gameTicTacTeo(name);
	}

}
