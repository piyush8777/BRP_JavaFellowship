/**
 * **************************************************************************************
 * Purpose:Write two programs Sin.java and Cos.java that compute sin x and cos x using the
 * Taylor series expansions as shown below...
 * Note - Convert angle x to an angle between -2 PI and 2 PI using following logic
 * x = x % (2 * Math.PI);
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 19-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day6;

import java.util.Scanner;

public class TaylorSeries {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Angle in Degree : ");
	        float x = sc.nextInt();
	        cal_sin(x);
	        cal_cos(x);
	    }
	    static void cal_sin(float x)
	    {
	        float accuracy = (float) 0.0001, denominator, sinx, sinval;
	        // Converting degrees to radian
	        x = x * (float)(3.142 / 180.0);
	        float x1 = x;
	        // maps the sum along the series
	        sinx = x;
	        // holds the actual value of sin(n)
	        sinval = (float)sin(x);
	        int i = 1;
	        do
	        {
	            denominator = 2 * i * (2 * i + 1);
	            x1 = -x1 * x * x / denominator;
	            sinx = sinx + x1;
	            i = i + 1;
	        } while (accuracy <= sinval - sinx);
	        System.out.println(sinx);
	    }
	    private static float sin(float x) {
			// TODO Auto-generated method stub
			return 0;
		}
		static void cal_cos(float x){
	        float accuracy = (float) 0.0001, denominator, cosx, cosval;
	        // Converting degrees to radian
	        x = x * (float)(3.142 / 180.0);
	        float x1 = x;
	        // maps the sum along the series
	        cosx = x;
	        // holds the actual value of sin(n)
	        cosval = (float)cos(x);
	        int i = 1;
	        do
	        {
	            denominator = 2 * i * (2 * i + 1);
	            x1 = -x1 * x * x / denominator;
	            cosx = cosx + x1;
	            i = i + 1;
	        } while (accuracy <= cosval - cosx);
	        System.out.println(cosx);
	    }
		private static float cos(float x) {
			// TODO Auto-generated method stub
			return 0;
		}

}
