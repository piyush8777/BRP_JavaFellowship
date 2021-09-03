/**
 * **************************************************************************************
 * Purpose:Code to returns the square root of that number use Newton's method 
 * (see Sqrt.java) to compute the result.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 24-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day9;

public class Sqrt {
	public static void main(String[] args) 
    { 

        double c = Double.parseDouble("3");
        double epsilon = 1.0e-15;  
        double t = c;              

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        System.out.println(t);
    }
}
