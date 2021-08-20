/**
 * **************************************************************************************
 * Purpose:Write a program Trig.java to illustrate various trigonometric functions in the Math
 * library, such as Math.sin(), Math.cos(), and Math.toRadians(). Firstly reads in an
 * angle (in degrees), converts to radians, and then performs various trigonometric
 * calculations.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 17-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day4;

import java.util.Scanner;

public class Trig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;

        System.out.println("Enter Angle in Degree : ");
        a = sc.nextDouble();

        b = Math.toRadians(a);
        System.out.println("Sin"+a+" is : "+Math.sin(b));
        System.out.println("Cos"+a+" is : "+Math.cos(b));
        System.out.println("Tan"+a+" is : "+Math.tan(b));
    }

}
