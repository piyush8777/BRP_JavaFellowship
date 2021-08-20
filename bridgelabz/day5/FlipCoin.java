/**
 * **************************************************************************************
 * Purpose:Write a program FlipCoin.java to simulate a coin flip and print out "Heads" or
 * "Tails" accordingly and finally print the percentage of Head vs Tail.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 18-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day5;

import java.util.Scanner;

class Toss {
    public String flip () {
        int num = (int) Math.floor(Math.random() * 10 ) % 2;
        if (num == 0)
            return "heads";
        else
            return "tails";
    }
}

public class FlipCoin {
	public static void main(String[] args) {
        Toss t = new Toss();
        Scanner sc = new Scanner(System.in);
        int size;
        int head = 0;
        int tail = 1;

        System.out.println("Enter number of Turn To be Flip :");
        size = sc.nextInt();

        for (int i = 1; i < size; i++) {
            if (t.flip().equals("heads")) {
                head++;
            } else {
                tail++;
            }
        }
        System.out.println("Size = " + size);
        System.out.println("Heads : " + head);
        System.out.println("Tails : " + tail);
    }

}

