package com.bridgelabz.day18.util;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	public static int getInt()
	{
		int i = sc.nextInt();
		return i;
	}
	
	public static String getLine()
	{
		String str = sc.nextLine();
		return str;
	}

	public static void gameTicTacTeo(String name)
	{
		// variable board is an array to initialize play board
		String[] board = new String[9];

		String turn; //player's turn
		String winner=null; // To check who is win 
		String player2; //name of player2

		/**
		 * @param board is an array to initialize board  
		 */ 
		// calling method to load board instruction
		boardInstruction(board);

		player2 =name;
		System.out.println("Board instruction.");
		System.out.println("Enter slot number which u want to occupy.");
		playBoard(board);
		// variable number to get player chosen number slot
		int number;
		turn="0";

		//Iterate until winner decide
		while(winner==null)
		{
			try 
			{
				// Logic to create random number while computer's turn
				if(turn.equalsIgnoreCase("0"))
				{
					Random rn = new Random();
					number =rn.nextInt(10);
					System.out.println("Computer chosed slot Number: "+number);
				}
				else // This else block exist while player2's turn
				{
					//System.out.println(player+" Your turn..!");
					number =Utility.getInt();

				}
				// It checks the given value is valid or not , value should be from 1 to 9
				if(!(number>0&&number<=9)) 
				{
					System.out.println("Invalid Input..!");
					continue;
				}
			}
			catch(InputMismatchException ie)
			{
				System.out.println("Enter valid Number");
				continue;
			}

			// It checks if the user given number and board's number is equal
			// It replace the number by player's symbol
			if(board[number-1].equals(String.valueOf(number)))
			{
				board[number-1]=turn;

				if(turn.equals("X"))
					turn="0";
				else
					turn="X";
				// Calling method to show updated playBoard
				playBoard(board);

				//Calling checkWinner Method to get winner name
				/**
				 * @param turn player's turn 
				 * @param player2 name of second player
				 * return winner 
				 */
				winner=checkWinner(board,turn,player2);	
			}
			else
			{
				System.out.println("Slot already occupied...! Chose different slot");
				continue;
			}
		}
		if(winner.equals("Draw"))
			System.out.println("Game is Draw1..!  Thanks for Playing..");
		else {

			if(winner.equals("X"))
				System.out.println("\tCongratulations "+player2+" You Won the Game");
			else
				System.out.println("\tcomputer Won the Game..!");

		}
	}

	/**
	 * 
	 * @param board an array of a board
	 * @param turn player's turn
	 * @param player2 name of second player
	 * @return it returns who is win. 
	 */
	private static String checkWinner(String[] board,String turn,String player2) 
	{	
		// Iterate until all winning possibilities check
		// variable possibility indicate the possible way 
		for (int possibility = 0; possibility < 8; possibility++) {

			// variable line result of game 
			String line=null;
			switch(possibility)
			{
			case 0:
				line=board[0]+board[1]+board[2];
				break;
			case 1:
				line=board[3]+board[4]+board[5];
				break;
			case 2:
				line=board[6]+board[7]+board[8];
				break;
			case 3:
				line=board[0]+board[3]+board[6];
				break;
			case 4:
				line=board[1]+board[4]+board[7];
				break;
			case 5:
				line=board[2]+board[5]+board[8];
				break;
			case 6:
				line=board[0]+board[4]+board[8];
				break;
			case 7:
				line=board[2]+board[4]+board[6];
				break;
			}
			//Check whose symbol is in line
			if(line.equals("XXX"))
				return "X";
			else if(line.equals("000"))
				return "0";
		}
		//Iterate and check any slot is empty
		for (int i = 0; i < 9; i++) {
			// here calling asList() method presents in arrays to take our array as list
			// To utilize in-built "contains()" method 
			if(Arrays.asList(board).contains(String.valueOf(i+1)))
				break;

			// if all slot filled match draw
			else if(i==8)
				return "draw";
		}

		//condition to change player's turn
		if(turn.equals("X"))
			System.out.println(player2 + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

	/**
	 * This method print the updated board
	 * @param board an array of board
	 */
	private static void playBoard(String[] board) 
	{

		System.out.println("\n\t"+board[0]+" | "+board[1]+" | "+board[2]);
		System.out.println("\t"+"---------");
		System.out.println("\t"+board[3]+" | "+board[4]+" | "+board[5]);
		System.out.println("\t"+"---------");
		System.out.println("\t"+board[6]+" | "+board[7]+" | "+board[8]);
	}

	/**
	 * This Method initialize the respective slot numbers
	 * @param board an array of board
	 */
	private static void boardInstruction(String[] board)
	{	// Iterate and show respective slot number to place player's symbol
		for(int i = 0;i<9;i++)
		{
			board[i]=String.valueOf(i+1);
		}	

	}
}
