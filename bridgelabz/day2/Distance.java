/**
 * **************************************************************************************
 * Purpose:Write a program Distance.java that takes two integer command-line arguments x
 * and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
 * formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 15-08-2021
 * ***************************************************************************************
 */
package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x ,y,distance;
       //Taking inputs from user
        System.out.println("Enter Arguments x,y : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
       //To calculate distance
        distance = Math.sqrt(x*x + y*y);
        System.out.println(distance);
    }

}
