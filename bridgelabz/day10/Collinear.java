/**
 * **************************************************************************************
 * Purpose:Code to check the three point are collinear or not using 
 * area of trangle.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 25-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day10;

import java.util.Scanner;

import com.bridgelabz.day10.util.MathFunction;

public class Collinear {
	 public static void main(String[] args)
	    {
	        int x1,x2,x3,y1,y2,y3;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the vale of x1,x2,x3,y1,y2,y3");
	        x1 = sc.nextInt();
	        x2=sc.nextInt();
	        x3 = sc.nextInt();
	        y1 = sc.nextInt();
	        y2 = sc.nextInt();
	        y3 = sc.nextInt();
	        System.out.println(" "+x1+ " "+x2+ " "+x3+ " "+y1+ " "+y2+ " "+y3 );
	        MathFunction.Collinear(x1,x2,x3,y1,y2,y3);
	    }

}
