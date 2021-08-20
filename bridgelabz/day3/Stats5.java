/**
 * **************************************************************************************
 * Purpose:Write a program Stats5.java that prints five uniform random values between 0 and 1,
 * their average value, and their minimum and maximum value. Use Math.random(),
 * Math.min(), and Math.max().
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 16-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day3;

public class Stats5 {
	public static void main(String[] args) {
        double[] array = new double[5];
        double avg,min,max;
        for (int i=0;i<5;i++){
            int num = (int) Math.floor(Math.random() * 10 ) % 2;
            array[i]+=num;
        }
//        System.out.println();
        System.out.print("Array Value : ");
        for (int j=0;j<5;j++){
            System.out.print(" "+array[j]);
        }

	}
}

