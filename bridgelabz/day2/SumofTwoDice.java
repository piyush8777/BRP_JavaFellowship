package com.bridgelabz.day2;

public class SumofTwoDice {
	public static void main(String[] args) {
        int num1 = (int) Math.floor(Math.random() * 10 % 6);
        int num2 = (int) Math.floor(Math.random() * 10 % 6);

        System.out.println("1stRandom Number: "+num1);
        System.out.println("2nd Random Number: "+num2);
        int sum;
        sum = num1 + num2;
        System.out.println("Sum of Two Random Number Is : "+sum);
    }

}
