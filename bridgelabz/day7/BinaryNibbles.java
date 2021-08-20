/**
 * **************************************************************************************
 * Purpose:Extend Binary.java to read an integer as an Input, convert to Binary and perform the
 * following functions.
 * i.Swap nibbles and find the new number.
 * ii.Find the resultant number is the number is a power of 2.
 * A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
 * Given a byte, swap the two nibbles in it. For example 100 is to be represented as
 * 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the
 * two nibbles, we get 01000110 which is 70 in decimal.
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 20-07-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day7;

import java.util.Scanner;

public class BinaryNibbles {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal,binary=0,reminder,temp=1;
        System.out.println("Enter a Decimal Number : ");
        decimal = sc.nextInt();
        System.out.println("after swap nibble : "+swapNibbles(decimal));
        while (decimal!=0){
            reminder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + reminder * temp;
            temp = temp * 10;
        }
        System.out.println("The Binary Number is : "+binary);
    }
    static int swapNibbles(int decimal)
    {
        return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);
    }

}
