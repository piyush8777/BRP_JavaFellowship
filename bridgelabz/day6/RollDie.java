/**
 * **************************************************************************************
 * Purpose: Write a program RollDie.java that generates the result of rolling a fair six-sided die
 * (an integer between 1 and 6). Repeat the Die Roll n times and suggest which
 * number between 1 and 6 fall maximum number of times.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 19-07-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day6;

import java.util.Scanner;

public class RollDie {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) Math.floor(Math.random() * 10 ) % 6;
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=1;i<n;i++){
            array[i] = num;
        }
        for (int i=1;i<n;i++){
            System.out.println(" "+array[i]);
        }
    }

}
