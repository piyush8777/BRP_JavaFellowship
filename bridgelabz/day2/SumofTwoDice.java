/**
 * **************************************************************************************
 * Purpose:Write a program SumOfTwoDice.java that prints the sum of two random integers
 *  between 1 and 6 (such as you might get when rolling dice).
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 15-07-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day2;

public class SumofTwoDice {
	public static void main(String[] args) {
		//Getting random value 1 to 6
        int num1 = (int) Math.floor(Math.random() * 10 % 6);
        int num2 = (int) Math.floor(Math.random() * 10 % 6);

        System.out.println("1stRandom Number: "+num1);
        System.out.println("2nd Random Number: "+num2);
        int sum;
        //Getting the sum and returning it
        sum = num1 + num2;
        System.out.println("Sum of Two Random Number Is : "+sum);
    }

}
