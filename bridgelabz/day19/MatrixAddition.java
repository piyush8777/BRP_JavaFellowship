/**
 * **************************************************************************************
 * Purpose:Code to Perform Matrix Multiplication (on Rectangular Matrix or Square Matrix)
 *  as well as Matrix Addition of two dimensional array
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 16-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day19;

import java.util.Scanner;

public class MatrixAddition {
	
		private double[][] mat;
		int row, column;

		//constructor
		MatrixAddition()
		{
			row=0;
			column=0;
		}

		//constructor
		MatrixAddition(int r, int c)
		{
			row = r;
			column = c;
			mat = new double[row][column];
		}

		//function to accept matrix values from user
		public void get_input()
		{
			Scanner s = new Scanner(System.in);
			int i=0,j=0;
			
			System.out.println("Enter the matrix elements(row-wise)");
			for (i=0; i < row; i++)
			{
				for(j=0; j<column; j++)
		        {
					mat[i][j] = s.nextDouble();
				}

			}
		}

		//function to print matrix 
		public void print_matrix()
		{
			int i = 0, j = 0;
			System.out.println("The matrix is:>>");
			for (i = 0; i < row; i++)
			{
				System.out.println("");
				for (j = 0; j < column; j++)
				{
					System.out.print("   "+mat[i][j]);
				}

			}
		}

		//function to add 2 matrices
		public MatrixAddition add(MatrixAddition m1)
		{
			MatrixAddition ans = new MatrixAddition(row,column);
			int i=0,j=0;
			if (this.row != m1.row || this.column != m1.column)
			{
				System.out.println("ERROR: The two matrices should have same no. of rows and columns for addition!");
			}
			else
			{
				for (i = 0; i < row; i++)
				{
					for (j = 0; j < column; j++)
					{
						ans.mat[i][j] = this.mat[i][j] + m1.mat[i][j];
					}
				}
			}
			return ans;
		}

		public void print_MatrixAddition() {
			// TODO Auto-generated method stub
			
		}
}
	
	class mat_op
	{

		
		
		public void main(String args[])
		{
			MatrixAddition m1;
			MatrixAddition m2;
			MatrixAddition ans;
			int i = 0, j = 0,r=0,c=0;
			Scanner s = new Scanner(System.in);

			//get the no. of rows and columns of the matrix from the user
			System.out.println("Enter no. of rows:");
			r = s.nextInt();
			System.out.println("Enter no. of columns:");
			c = s.nextInt();

			//accept the first matrix
			System.out.println("Enter the first matrix:>>");
			m1 = new MatrixAddition(r,c);
			m1.get_input();

			//accept the second matrix
			System.out.println("Enter the second matrix:>>");
			m2 = new MatrixAddition(r,c);
			m2.get_input();

			//Add the 2 matrices and print the result
			ans = m1.add(m2);
			System.out.println("\nAddition of the two matrices is:>>");
			ans.print_MatrixAddition();

		}
	}
