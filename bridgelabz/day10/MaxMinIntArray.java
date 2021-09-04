/**
 * **************************************************************************************
 * Purpose:Code to find Maximum and Minimum value from Integer Array.
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

public class MaxMinIntArray {
	 public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        int[] array = new int[10];
	        System.out.println("Enter the names");
	        for (int i = 0;i < array.length;i++)
	        {
	            array[i] =scanner.nextInt();
	        }
	        System.out.println(Arrays.toString(array));
	        MathFunction.MaxMinIntArray(array);
	    }

}
