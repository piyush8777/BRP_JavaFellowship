/**
 * **************************************************************************************
 * Purpose:Write a DoubleOpt.java program by taking a, b and c as input values and print the
 * following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please
 * also understand the precedence of the operators
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 15-07-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day2;

import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a,b,c,num1,num2,num3,num4,result;
        //Taking input from the user
        System.out.println("Enter Value of a , b , c :");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        num1 = a + b * c;
        num2 = a * b + c;
        num3 = c + a / b;
        num4 = a % b + c;

        System.out.println("num1 = a + b * c =>> "+num1);
        System.out.println("num2 = a * b + c =>> "+num2);
        System.out.println("num3 = c + a / b =>> "+num3);
        System.out.println("num4 = a % b + c =>> "+num4);

    }

}
