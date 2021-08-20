/**
 * **************************************************************************************
 * Purpose:Write a TemperaturConversion.java program, given the temperature in fahrenheit
 * as input outputs the temperature in Celsius or viceversa using the formula
 * Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
 * Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 17-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day4;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double choice,c,f,celcius_fahrenheit,fahrenheit_celcius;
        System.out.println("Enter Choice for Temperature 1- Celcius  2- Fahrenheit");
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Enter Temperature in Celcius : ");
            c = sc.nextDouble();
            celcius_fahrenheit = (c * 9/5 ) + 32 ;
            System.out.println("Celcius to Fehrenheit is : "+celcius_fahrenheit);
        }
        else {
            System.out.println("Enter Temperature in Fahrenheit : ");
            f = sc.nextDouble();
            fahrenheit_celcius = (f - 32) * 5 / 9;
            System.out.println("Celcius to Fehrenheit is : " + fahrenheit_celcius);
        }
    }

}
