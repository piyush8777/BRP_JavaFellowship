package com.bridgelabz.day16.util;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility<E> {
	Scanner sc = new Scanner(System.in);
	/**
	 * Purpose: To check Leap a Year is Leap Year or not
	 * 
	 * @param year --> type integer
	 * @return --> boolean
	 */
	public static boolean isLeapYear(int year) {
		/**
		 * A leap year is exactly divisible by 4 except for century years (years ending
		 * with 00). The century year is a leap year only if it is perfectly divisible
		 * by 400
		 */
		boolean leapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = true;
			return leapYear;
		}

		else {
			leapYear = false;
			return leapYear;
		}

	}
	public  static Integer[][] arrayInt(int row, int column) {
		Integer[][] genericArray = new Integer[row][column];
		int i, j = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = sc.nextInt();
			}}
		return genericArray;}

	// 2darray for double
	/**
	 * static function that returns a generic array of double type
	 * @param row
	 * @param column
	 * @return
	 */
	public  Double[][] arrayDouble(int row, int column) {
		Double[][] genericArray = new Double[row][column];
		int i, j = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				System.out.println("row[" + i + "]column[" + j + "]");
				genericArray[i][j] = sc.nextDouble();
			}}
		return genericArray;}
	
	//boolean function
	/**
	 * static function that returns a generic array of boolean type
	 * @param row
	 * @param column
	 * @return
	 */
	
		public static Boolean[][] arrayBoolean(int row,int column){
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			Boolean[][] genericArray=new Boolean[row][column];
			System.out.println("enter the bollean value");
			System.out.println("enter the value between 0 and 1");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.println("row[" + i + "]column[" + j + "]");
					genericArray[i][j] = sc.nextBoolean();
				}	}
			return genericArray;}
	//generic function
	/**
	 * static function that prints the array of generic type
	 * 
	 * @param genericArray array of any data type 
	 */
	public void display(E[][] genericArray,int row,int column)
	{
		PrintWriter th=new PrintWriter(System.out,true);
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++)
				th.print(genericArray[i][j]+" ");
			th.println();}}

  
}
