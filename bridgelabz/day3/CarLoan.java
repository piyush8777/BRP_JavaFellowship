/**
 * **************************************************************************************
 * Purpose:Write a program CarLoan.java that reads in three command-line arguments P, Y,
 * and R and calculates the monthly payments you would have to make over Y years to
 * pay off a P principal loan amount at R per cent interest compounded monthly.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 16-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day3;

import java.util.Scanner;

public class CarLoan {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double P,Y,R,payment;
	     //Taking input from the user
	        System.out.println("Enter Loan Amount : ");
	        P = sc.nextDouble();
	        System.out.println("Enter Year : ");
	        Y = sc.nextDouble();
	        System.out.println("Enter Rate : ");
	        R = sc.nextDouble();
	        double div, n = 12 * Y,r = R /(12 * 100);
	        div = (1 - Math.pow((1 + r), (-n)));
	        payment = (P * r) / div;
	        double interest = payment * n - P;
	        System.out.println("Loan Amount : "+P);
	        System.out.println("Interest Rate per Month (%) : "+r);
	        System.out.println("Loan Period (Months) : "+n);
	        System.out.println("Monthly Payments : "+payment);
	        System.out.println("Total interest : "+interest);
	    }

}
