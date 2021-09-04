/**
 * **************************************************************************************
 * Purpose:Code to find max and min from String Array.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 25-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day10;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.day10.util.MathFunction;

public class MaxString {
	 public static void main(String[] args)
	    {
	        //Taking input from user
	        Scanner sc = new Scanner(System.in);
	        String[] array = new String[5];
	        System.out.println("Enter the names");
	        for (int i = 0;i < array.length;i++)
	        {
	            array[i] =sc.nextLine();
	        }
	        System.out.println(Arrays.toString(array));
	        MathFunction.MaxString(array);
	    }

}
