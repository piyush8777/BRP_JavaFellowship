/**
 * **************************************************************************************
 * Purpose:Code to find the Transpose of the matrix and do multiplication to find the
 * resultant Matrix.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 18-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day21;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many rows you want");
        int row =sc.nextInt();
        System.out.println("Enter how many cols you want");
        int cols =sc.nextInt();
        //Declear  2D Array
        int [][] matA=new int[row][cols];
        int[][] multi =new int[row][cols];
        System.out.println("Enter " +(row*cols)+" values");
        for (int i =0;i<row;i++)
        {
            for (int j=0;j<cols;j++)
                matA[i][j]=sc.nextInt();
        }
        System.out.println("Orignal Matrix");
        for (int i =0;i<row;i++)
        {
            for (int j =0;j<cols;j++)
            {
                System.out.print(matA[i][j]+"\t");
            }
                System.out.println();
        }
        System.out.println("Transpose Matrix");
        for (int i =0;i<cols;i++)  //Taking 1 cols and print it as row
        {
            for (int j =0;j<row;j++)
            {
                System.out.print(matA[j][i]+"\t");
            }
            System.out.println();
        }

}
}
