/**
 * **************************************************************************************
 * Purpose:Code to find the determinant of each of the 2x2 minor matrices
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 18-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day21;

import java.util.Scanner;

public class Twomatrix {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int[][] arr = new int[2][2];
		
		int i, j, determinant = 0;
		
		sc= new Scanner(System.in);
		
		System.out.println("\n Please Enter the Matrix Items :  ");
		for(i = 0; i < 2; i++) {
			for(j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}		
		}
		
		determinant = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);

		System.out.println("The Determinant of 2 * 2 Matrix = " + determinant );
		
	}

}
