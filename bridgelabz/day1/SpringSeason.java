/**
 * **************************************************************************************
 * Purpose:Write a program SpringSeason.java that takes two int values m and d from the
 *  command line and prints true if day d of month m is between March 20 (m = 3, d=20) 
 *  and June 20 (m = 6, d = 20), false otherwise.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 14-08-2021
 * ***************************************************************************************
 */
package com.bridgelabz.day1;

public class SpringSeason {
	public static void main(String[] args) {
        
        int Month = 0;
		int date = 0;
		if (Month <= 6 & date <= 20) {
        	System.out.println(true);
        }

        else if (Month >= 3 & date<3 ) {
        	System.out.println(true);
        }

        else {
        	System.out.println(false);
        }
	}

}
