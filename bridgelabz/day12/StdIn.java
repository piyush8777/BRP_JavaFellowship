package com.bridgelabz.day12;

/**
 * **************************************************************************************
 * Purpose:Code to provide static methods for reading strings and numbers from standard 
 * input.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 27-08-2021
 * ***************************************************************************************
 */

import java.util.Scanner;

public class StdIn {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); // creates instance of Scanner to read from console
	        int num = 0;
	        System.out.println("Enter an integer followed by a String");
	        if (sc.hasNextInt())
	            num = sc.nextInt();
	        else {
	            System.out.println("Input error, program terminating");
	            sc.close(); // close scanner
	            return;
	        }
	        String str = sc.nextLine();
	        System.out.println("integer = " + num + "string = " + "'" + str + "'");
	        sc.close(); // close scanner
	    }

	

}
