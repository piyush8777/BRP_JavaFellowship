/**
 * **************************************************************************************
 * Purpose:Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
 *  Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 *  can be found using a formula
 *  delta = b*b - 4*a*c
 *  Root 1 of x = (-b + sqrt(delta))/(2*a)
 *  Root 2 of x = (-b - sqrt(delta))/(2*a)
 *  Take a, b and c as input values to find the roots of x.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 14-08-2021
 * ***************************************************************************************
 */
package com.bridgelabz.day1;

import java.util.Scanner;

public class Quadratic {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        double a,b,c,x =0,y = 0;
	        double delta=0,equation1,equation2;
         //Taking input from user and find the roots
	        System.out.println("Enter value of a,b,c: ");
	        a=sc.nextInt();
	        b=sc.nextInt();
	        c=sc.nextInt();

	        delta = b*b - 4*a*c;

	        y = (-b + Math.sqrt(delta))/(2*a);
	        x = (-b - Math.sqrt(delta))/(2*a);

	        equation1 = a * y * y + b*y + c;
	        equation2 = a * x * x + b*x + c;
	        System.out.println(equation1);
	        System.out.println(equation2);
	    }
	}

