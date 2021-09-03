/**
 * **************************************************************************************
 * Purpose:Code to return factor of the number
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 24-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day9;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
        int i =1;
        int fact =1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number = sc.nextInt();
        MathFunction.Factorial(number,i,fact);
    }

}
