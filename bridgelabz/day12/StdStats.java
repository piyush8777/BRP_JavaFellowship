/**
 * **************************************************************************************
 * Purpose:Code to takes array of realnumbers from standard input, and computes the 
 * minimum, mean, maximum, and s.d.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 27-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day12;

import java.util.Arrays;

public class StdStats {
	 public static void main(String[] args) {
	        int[] arr = {9,5,4,2,1,7,8,3};
	        int left = 0;
	        int right = arr.length - 1;
	        int even = 0;

	        Arrays.sort(arr);
	        while(left < right)
	        {
	           left++;
	        }
	        System.out.println(Arrays.toString(arr));

	    }
	

}
