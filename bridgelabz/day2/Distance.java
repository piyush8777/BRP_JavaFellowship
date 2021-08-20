package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x ,y,distance;

        System.out.println("Enter Arguments x,y : ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        distance = Math.sqrt(x*x + y*y);
        System.out.println(distance);
    }

}
