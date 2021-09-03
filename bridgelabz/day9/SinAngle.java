/**
 * **************************************************************************************
 * Purpose:Code to return a sin of an angle
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 24-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day9;

import java.util.Scanner;

public class SinAngle {
	@SuppressWarnings("resource")
	public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(MathFunction.sinAngleCalculation(number));
    }

}
