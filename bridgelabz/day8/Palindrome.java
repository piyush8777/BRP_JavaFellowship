/**
 * **************************************************************************************
 * Purpose:Program to Check Number is Palindrome or Not
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 23-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day8;

import java.util.Scanner;

import Util.Utility;

public class Palindrome {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        Utility.checkPalindrome(str);

    }

}
