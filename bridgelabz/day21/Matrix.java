/**
 * **************************************************************************************
 * Purpose:Code to find the determinant of a matrix. Determinant of 3 x 3 Matrix.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 18-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day21;

import java.util.Scanner;

public class Matrix {
	
	    private static Scanner sc;
	    public static void main(String[] args)
	    {
	        int[][] arr = new int[3][3];
	        int i, j, x, y, z, determinant = 0;
	        sc = new Scanner(System.in);
	        System.out.println("Please Enter the Matrix Items :  ");
	        for (i = 0; i < 3; i++)
	        {
	            for (j = 0; j < 3; j++)
	            {
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        x = (arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]);
	        y = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[1][2]);
	        z = (arr[1][0] * arr[2][1]) - (arr[2][0] * arr[1][1]);

	        determinant = (arr[0][0] * x) - (arr[0][1] * y) + (arr[0][2] * z);
	        System.out.println("The Determinant of 3 * 3 Matrix = " + determinant);
	    }

}
