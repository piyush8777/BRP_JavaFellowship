/**
 * **************************************************************************************
 * Purpose:Code to Take a range of 0 - 1000 Numbers and find the Prime numbers in that 
 * range.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 01-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day17;

public class Prime2DArray {
	
	    // method to check number is prime number or not
	    public static boolean isPrime(int n)
	    {
	        if (n == 0 || n == 1)
	        {
	            return false;
	        }
	        int i = 2;
	        while (i <= n / 2)
	        {
	            if (n % i == 0)
	            {
	                return false;
	            }
	            i++;
	        }
	        return true;
	    }
	    public static void main(String[] args)
	    {
	        int prime[][] = new int[11][2];  //creation of 2d array
	        int k = 0;
	        int count = 0;  //to count how many prime number is there
	        for (int i = 0; i <= 1000; i++)
	        {
	            boolean x = isPrime(i);
	            if (x)
	            {
	                count++;
	            }
	            if (i % 100 == 0 && i != 0)
	            {
	                prime[k][0] = i;
	                prime[k][1] = count;
	                count = 0;
	                k++;
	            }
	        }
	        int j = 0;
	        while (j < 2)
	        {
	            for (int n = 0; n < 10; n++)
	            {
	                System.out.print(prime[n][j] + " ");
	            }
	            System.out.println();
	            j++;
	        }
	    }

}
