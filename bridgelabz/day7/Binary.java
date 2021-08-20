/**
 * ********************************************************************************************
 * Purpose:Write a program Binary.java prints the binary (base 2) representation of the decimal
 * number typed as the command-line argument. It is based on decomposing the
 * number into a sum of powers of 2. For example, the binary representation of 106 is
 * 11010102, which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure
 * necessary padding to represent 4 Byte String.
 * To compute the binary representation of n, we consider the powers of 2 less than or
 * equal to n in decreasing order to determine which belong in the binary
 * decomposition (and therefore correspond to a 1 bit in the binary representation).
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 20-08-2021
 * **********************************************************************************************
 */

package com.bridgelabz.day7;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal,binary=0,reminder,temp=1;
        System.out.println("Enter a Decimal Number : ");
        decimal = sc.nextInt();
        while (decimal!=0){
            reminder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("The Binary Number is : "+binary);
    }

}
