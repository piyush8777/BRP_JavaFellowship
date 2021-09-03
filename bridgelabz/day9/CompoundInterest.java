/**
 * **************************************************************************************
 * Purpose:Code to computes the amount of money you will have if you invest C dollars 
 * today at the compound interest rate of r per period, in T periods.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 24-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day9;

import java.util.Scanner;

public class CompoundInterest {
	 public static void main(String[] args) 
	   {
	       double principal = 0.0, rate = 0.0, time = 0.0;
	       int number = 0;
	       double totalAmount = 0.0, cinterest = 0.0;

	       Scanner scan = new Scanner(System.in);

	       System.out.print("Enter principal amount:: ");
	       principal = scan.nextDouble();
	       System.out.print("Enter the annual compound interest rate :: ");
	       rate = scan.nextDouble();
	       rate = rate/100; 
	       System.out.print("Enter time (in years):: ");
	       time = scan.nextDouble();
	       System.out.print("Enter the number of times that "+"interest is compounded per year:: ");
	       number = scan.nextInt();

	       totalAmount = principal * 
	                 Math.pow( 1+(rate/number), number*time);

	       cinterest = totalAmount - principal;

	       System.out.println("Compound interest = "+ cinterest);
	       System.out.println("Total amount = "+ totalAmount);

	       scan.close();
	   }

}
