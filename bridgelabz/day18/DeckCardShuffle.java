/**
 * **************************************************************************************
 * Purpose:Code to to Initialize the Deck of Cards, Shuffle the Deck of Cards using 
 * Random method
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 02-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day18;

import java.util.Random;

public class DeckCardShuffle {
	 public static void shuffle(int card[], int n)
	    {

	        Random rand = new Random();

	        for (int i = 0; i < n; i++)
	        {
	            // Random for remaining positions.
	            int r = i + rand.nextInt(52 - i);

	            //swapping the elements
	            int temp = card[r];
	            card[r] = card[i];
	            card[i] = temp;

	        }
	    }

	    // Driver code
	    public static void main(String[] args)
	    {
	        // Array from 0 to 51
	        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8,
	                9, 10, 11, 12, 13, 14, 15,
	                16, 17, 18, 19, 20, 21, 22,
	                23, 24, 25, 26, 27, 28, 29,
	                30, 31, 32, 33, 34, 35, 36,
	                37, 38, 39, 40, 41, 42, 43,
	                44, 45, 46, 47, 48, 49, 50,
	                51};

	        shuffle(a, 52);

	        // Printing all shuffled elements of cards
	        for (int i = 0; i < 52; i ++)
	            System.out.print(a[i]+" ");

	    }

}
