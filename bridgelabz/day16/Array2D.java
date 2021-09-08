/**
 * **************************************************************************************
 * Purpose:Code to read in 2D arrays of integers, doubles, or booleans from standard 
 * input and printing them out to standard output.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 31-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day16;

import java.util.Scanner;

import com.bridgelabz.day16.util.Utility;

public class Array2D {
	public static void main(String[] args) {
		Utility<Object> func = new Utility<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input total row : ");
		//Reading the input from the user
		int row = sc.nextInt();
		System.out.print("Input total column : ");
		//Reading the input from the user
		int column = sc.nextInt();
		System.out.println("1:Integer Array\n" + "2:Double Array\n" + "3:Boolean Array");
		//Reading the input from the user
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Integer[][] arr1 = Utility.arrayInt(row, column);
			func.display(arr1,row,column);
			break;
		case 2:
			Double[][] arr2 = func.arrayDouble(row, column);
			func.display(arr2,row,column);
			break;
		case 3:
			Boolean[][] arr3 = Utility.arrayBoolean(row, column);
			func.display(arr3,row,column);
			break;
		default:
			System.out.println("Please select any option between 1, 2 and 3");
			break;
		}
		sc.close();
	}

}
