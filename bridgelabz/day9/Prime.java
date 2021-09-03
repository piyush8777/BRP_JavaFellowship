/**
 * **************************************************************************************
 * Purpose:Code to takes an integer argument N and returns true or false depending on 
 * whether N is prime.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 24-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day9;

public class Prime {
	 public static void main(String[] args)
	    {
	        System.out.println("is 17 Prime: "+isPrime(17));
	        System.out.println("is 27 Prime: "+isPrime(27));
	        System.out.println("is 79 Prime: "+isPrime(79));
	    }
	 
	    public static boolean isPrime(int num) 
	    {
	           if (num <= 1)
	           {
	               return false;
	           }
	           for (int i = 2; i <= Math.sqrt(num); i++)
	           {
	               if (num % i == 0) 
	               {
	                   return false;
	               }
	           }
	           return true;
	    }

}
