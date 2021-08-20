/**
 * **************************************************************************************
 * Purpose:Write a LeapYear.java program that takes a year as input and outputs the Year
 *  is a Leap Year or not a Leap Year.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 14-07-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day1;

public class LeapYear {
	public static void main(String[] args) {
		// if the year is divided by 4
	    int year = 2012;
		boolean leap;
		if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else {
	      leap = false;
	    }

	    if (leap) {
	      System.out.println(year + " is a leap year.");
	      }
	    else {
	      System.out.println(year + " is not a leap year.");
	      }
	  
	
	}
}

