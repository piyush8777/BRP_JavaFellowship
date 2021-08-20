/**
 * ******************************************************************************************
 * Purpose:Write a program to compute Factors of a number N using prime factorization method.
 * Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
 * O/P -> Print the prime factors of number N.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 20-08-2021
 * *******************************************************************************************
 */

package com.bridgelabz.day7;

import java.util.Scanner;

public class PrimeFactor {
	 public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        int num,i;
	        System.out.println("Enter a number:");
	        num = sc.nextInt();
	        System.out.println("Prime Factor of " +num+ " are ");
	        while (num%2==0){
	            System.out.println("2");
	            num=num/2;
	        }
	        for (i=3;i<Math.sqrt(num);i=i+2){
	            while (num%i==0){
	                System.out.println(i+"");
	                num=num/i;
	            }
	        }
	        if(num>2)
	            System.out.println(num+"");
	    }

}
