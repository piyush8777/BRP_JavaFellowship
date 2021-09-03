/**
 * **************************************************************************************
 * Purpose:Code to check if the given two strings are an Anagram.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 23-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day8;

import java.util.Scanner;

import Util.Utility;

public class Anagram {
	 public static void main(String[] args)
	    {
	        // take input from users
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter first String: ");
	        String str1 = input.nextLine();
	        System.out.print("Enter second String: ");
	        String str2 = input.nextLine();

	       Utility.Anagram(str1, str2);

	    }

}
