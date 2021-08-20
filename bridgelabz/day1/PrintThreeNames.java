/**
 * **************************************************************************************
 * Purpose:Write a program “ PrintThreeNames.java ” that takes three names as input and
 *  prints out a proper sentence with the names in the reverse of the order given, so
 *  that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
 *  and Alice.".
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 14-07-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day1;

public class PrintThreeNames {
	static String wordReverse(String str)
	{
	    int i = str.length() - 1;
	    int start, end = i + 1;
	    String result = "";
	     
	    while(i >= 0)
	    {
	        if(str.charAt(i) == ' ')
	        {
	            start = i + 1;
	            while(start != end)
	            result += str.charAt(start++);
	             
	            result += ' ';
	             
	            end = i;
	        }
	        i--;
	    }
	     
	    start = 0;
	    while(start != end)
	        result += str.charAt(start++);
	     
	    return result;
	   }
	  
	// Driver code
	public static void main(String[] args)
	{
	    String str = "I AM A GEEK";
	     
	    System.out.print(wordReverse(str));
	}

}

